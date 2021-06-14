package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "classes", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Classes {
    @Id
    @SequenceGenerator(name = "classes_id_seq",
            sequenceName = "classes_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "classes_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "class")
    private Integer classs;
    @Column(name = "suffix")
    private String suffix;
    @Column(name = "status")
    private Integer status;
    @Column(name = "manager_id")
    private Integer manager_id;
}
