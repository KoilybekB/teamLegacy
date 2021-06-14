package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "lessons", schema = "public")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class Lessons {
    @Id
    @SequenceGenerator(name = "lessons_id_seq",
            sequenceName = "lessons_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "lessons_id_seq")
    @Column(name = "id")
    private Integer id;
    @Column(name = "lesson_time")
    private Double lesson_time;
    @Column(name = "subject_id")
    private Integer subject_id;
    @Column(name = "teacher_id")
    private Integer teacher_id;
    @Column(name = "class_id")
    private Integer class_id;
}
