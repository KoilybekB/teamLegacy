package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "user_rights", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class UserRights {
    @Id
    @SequenceGenerator(name = "user_rights_id_seq",
            sequenceName = "user_rights_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_rights_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "status")
    private Integer status;
    @Column(name = "role_id")
    private Integer role_id;
    @Column(name = "user_id")
    private Integer user_id;
}
