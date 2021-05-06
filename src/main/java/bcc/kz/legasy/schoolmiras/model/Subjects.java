package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "subjects", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Subjects {
    @Id
    @SequenceGenerator(name = "subjects_id_seq",
            sequenceName = "subjects_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "subjects_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Integer status;
}
