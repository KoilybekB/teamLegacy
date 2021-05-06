package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "roles", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Roles {
    @Id
    @SequenceGenerator(name = "roles_id_seq",
            sequenceName = "roles_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "roles_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Integer status;
}