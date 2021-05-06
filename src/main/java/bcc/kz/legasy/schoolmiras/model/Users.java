package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "users", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Users {
    @Id
    @SequenceGenerator(name = "users_id_seq",
            sequenceName = "users_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "users_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "login")
    private String login;
    @Column(name = "passwd")
    private String passwd;
    @Column(name = "status")
    private Integer status;
}
