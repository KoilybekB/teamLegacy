package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "student", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Student {
    @Id
    @SequenceGenerator(name = "student_id_seq",
            sequenceName = "student_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "student_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "status")
    private Integer status;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "idn")
    private String idn;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "address")
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "sex")
    private Integer sex;
    @Column(name = "class_id")
    private Integer class_id;
}
