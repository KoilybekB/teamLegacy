package bcc.kz.legasy.schoolmiras.repository;

import bcc.kz.legasy.schoolmiras.model.EduYear;
import bcc.kz.legasy.schoolmiras.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    /*Teacher*/
    List<Schedule> findAllByTeacherIdAndDayOfWeekOrderBySubjectOrder(Integer teacherId, DayOfWeek dayOfWeek);

    List<Schedule> getAllByTeacherIdAndSubjectOrder(Integer teacherId, Integer subjectOrder);

    List<Schedule> findAllByTeacherIdAndSubjectOrder(Integer teacherId, Integer subjectOrder);

    List<Schedule> findAllByTeacherId(Integer teacherId);

    List<Schedule> findAllByTeacherIdAndEduYear(Integer teacherId, EduYear eduYear);

    List<Schedule> findAllByTeacherIdAndSubjectIdAndEduYear(Integer teacherId, Integer subjectId, EduYear eduYear);

    /*Student*/
    List<Schedule> findAllByGroupIdAndSubjectOrder(Integer groupId, Integer subjectOrder);

    List<Schedule> findAllByGroupIdAndEduYear(Integer groupId, EduYear eduYear);

    List<Schedule> findAllByGroupIdAndDayOfWeekOrderBySubjectOrder(Integer groupId, DayOfWeek dayOfWeek);

}
