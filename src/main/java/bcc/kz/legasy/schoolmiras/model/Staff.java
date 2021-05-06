package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "staff", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Staff {
    @Id
    @SequenceGenerator(name = "staff_id_seq",
            sequenceName = "staff_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "staff_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "status")
    private  Integer status;
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "idn")
    private String idn;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "address")
    private String address;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "sex")
    private Integer sex;
}
