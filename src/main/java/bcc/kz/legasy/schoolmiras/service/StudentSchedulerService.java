package bcc.kz.legasy.schoolmiras.service;
import bcc.kz.legasy.schoolmiras.model.EduYear;
import bcc.kz.legasy.schoolmiras.model.dto.student.SchedulerRow;
import bcc.kz.legasy.schoolmiras.model.dto.student.StudentLessonList;
import bcc.kz.legasy.schoolmiras.model.dto.student.StudentTodayLesson;


import java.util.List;

public interface StudentSchedulerService {
    List<SchedulerRow> getAll(Long studentId, EduYear eduYear);

    List<StudentTodayLesson> getToday(Long studentId);

    List<StudentLessonList> getLessonList(Long studentId, EduYear eduYear);

}


