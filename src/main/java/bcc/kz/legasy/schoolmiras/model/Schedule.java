package bcc.kz.legasy.schoolmiras.model;

import lombok.*;

import javax.persistence.*;
import javax.security.auth.Subject;
import java.time.DayOfWeek;

@Builder(toBuilder = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lessons", schema = "public")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "subject_id")
    private Long subjectId;
    @ManyToOne
    @JoinColumn(name = "subject_id", insertable = false, updatable = false)
    private Subjects subject;

    @Column(name = "room_id")
    private Long roomId;
    @ManyToOne
    @JoinColumn(name = "room_id", insertable = false, updatable = false)
    private Room room;

    @Column(name = "teacher_id")
    private Long teacherId;
    @ManyToOne
    @JoinColumn(name = "teacher_id", insertable = false, updatable = false)
    private Teacher teacher;

    @Column(name = "group_id")
    private Long groupId;
    @ManyToOne
    @JoinColumn(name = "group_id", insertable = false, updatable = false)
    private Group group;

    @Column(name = "additional_info_id")
    private Long additionalInfoId;
    @ManyToOne
    @JoinColumn(name = "additional_info_id", insertable = false, updatable = false)
    private AdditionalInfo additionalInfo;

    @Column(name = "time_id")
    private Long timeId;
    @ManyToOne
    @JoinColumn(name = "time_id", insertable = false, updatable = false)
    private Time time;

    @Column(name = "edu_year")
    private EduYear eduYear;

    @Column(name = "subject_order")
    private Long subjectOrder;

    @Column(name = "day_of_week")
    private DayOfWeek dayOfWeek;

}
