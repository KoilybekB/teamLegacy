create table roles
(
    id          integer not null
        constraint roles_pk
            primary key,
    description varchar(200),
    status      integer
);

alter table roles
    owner to admin;

create table subjects
(
    id          integer not null
        constraint subjects_pk
            primary key,
    description varchar(50),
    status      integer
);

alter table subjects
    owner to admin;

create table users
(
    id     integer not null
        constraint users_pk
            primary key,
    login  varchar(30),
    passwd varchar(100),
    status integer
);

alter table users
    owner to admin;

create table staff
(
    id           integer not null
        constraint staff_pk
            primary key,
    status       integer,
    user_id      integer
        constraint r_25
            references users
            on delete set null,
    idn          varchar(12),
    last_name    varchar(70),
    first_name   varchar(70),
    birthdate    date,
    address      varchar(200),
    phone_number varchar(30),
    sex          char
);

alter table staff
    owner to admin;

create table classes
(
    id         integer not null
        constraint classes_pk
            primary key,
    class      integer,
    suffix     varchar(2),
    status     integer,
    manager_id integer
        constraint r_31
            references staff
            on delete set null
);

alter table classes
    owner to admin;

create table lessons
(
    id          integer not null
        constraint lessons_pk
            primary key,
    lesson_time timestamp,
    subject_id  integer
        constraint r_32
            references subjects
            on delete set null,
    teacher_id  integer
        constraint r_33
            references staff
            on delete set null,
    class_id    integer
        constraint r_34
            references classes
            on delete set null
);

alter table lessons
    owner to admin;

create table student
(
    id           integer not null
        constraint student_pk
            primary key,
    status       integer,
    user_id      integer,
    idn          varchar(12),
    last_name    varchar(70),
    first_name   varchar(70),
    birthdate    date,
    address      varchar(200),
    phone_number varchar(30),
    sex          char,
    class_id     integer
        constraint r_30
            references classes
            on delete set null
);

alter table student
    owner to admin;

create table user_rights
(
    id      integer not null
        constraint user_rights_pk
            primary key,
    status  integer,
    role_id integer
        constraint r_22
            references roles
            on delete set null,
    user_id integer
        constraint r_23
            references users
            on delete set null
);

alter table user_rights
    owner to admin;
