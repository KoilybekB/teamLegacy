package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.EduYear;
import bcc.kz.legasy.schoolmiras.model.Schedule;
import bcc.kz.legasy.schoolmiras.model.Student;
import bcc.kz.legasy.schoolmiras.model.dto.student.LessonItem;
import bcc.kz.legasy.schoolmiras.model.dto.student.SchedulerRow;
import bcc.kz.legasy.schoolmiras.model.dto.student.StudentLessonList;
import bcc.kz.legasy.schoolmiras.model.dto.student.StudentTodayLesson;
import bcc.kz.legasy.schoolmiras.repository.ScheduleRepository;
import bcc.kz.legasy.schoolmiras.repository.StudentRepository;
import bcc.kz.legasy.schoolmiras.service.StudentSchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*@Service
public class StudentSchedulerServiceImpl implements StudentSchedulerService {
/*
    @Autowired
    private StudentRepository studentRepository;

    private final ScheduleRepository scheduleRepository;

    @Autowired
    public StudentSchedulerService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<SchedulerRow> getAll(Integer studentId, EduYear eduYear) {
        List<SchedulerRow> schedulerTable = new ArrayList<>();
        Student student = studentRepository.findById(studentId).orElse(null);
        for (int i = 0; i < 10; i++) {
            Integer subjectOrder = i + 1;
            List<Schedule> scheduleListByOrder = scheduleRepository.findAllByGroupIdAndSubjectOrder(student.getClass_id(), subjectOrder);
            SchedulerRow schedulerRow = new SchedulerRow();
            schedulerRow.setTime((i + 9) + ":00");
            schedulerRow.setL1(objectMapperDto(scheduleListByOrder, DayOfWeek.MONDAY));
            schedulerRow.setL2(objectMapperDto(scheduleListByOrder, DayOfWeek.TUESDAY));
            schedulerRow.setL3(objectMapperDto(scheduleListByOrder, DayOfWeek.WEDNESDAY));
            schedulerRow.setL4(objectMapperDto(scheduleListByOrder, DayOfWeek.THURSDAY));
            schedulerRow.setL5(objectMapperDto(scheduleListByOrder, DayOfWeek.FRIDAY));
            schedulerRow.setL6(objectMapperDto(scheduleListByOrder, DayOfWeek.SATURDAY));
            schedulerTable.add(schedulerRow);
        }
        return schedulerTable;
    }

    private LessonItem objectMapperDto(List<Schedule> scheduleListByOrder, DayOfWeek dayOfWeek) {
        LessonItem lessonItem = new LessonItem();
        Optional<Schedule> optionalSchedule = scheduleListByOrder.stream().filter(tt -> tt.getDayOfWeek().getValue() == dayOfWeek.getValue()).findFirst();
        if (optionalSchedule.isPresent()) {
            Schedule schedule = optionalSchedule.get();
            lessonItem.setRoom(schedule.getRoom().getCode() + ", " + schedule.getRoom().getCode());
            lessonItem.setGroup(schedule.getGroup().getName());
            lessonItem.setName(schedule.getSubject().);
            lessonItem.setTeacher(schedule.getTeacher().getName());
            lessonItem.setFree(false);
        } else {
            lessonItem.setRoom_Id(0);
            lessonItem.setGroup("");
            lessonItem.setName("");
            lessonItem.setTeacher("");
            lessonItem.setFree(true);
        }
        return lessonItem;
    }

    @Override
    public List<StudentTodayLesson> getToday(Integer studentId) {
        List<StudentTodayLesson> studentTodayLessons = new ArrayList<>();
        Student student = studentRepository.findById(studentId).orElse(null);
        List<Schedule> todaySchedule = scheduleRepository.findAllByGroupIdAndDayOfWeekOrderBySubjectOrder(student.getClass_id(), LocalDate.now().getDayOfWeek());
        for (Schedule s: todaySchedule) {
            StudentTodayLesson lesson = new StudentTodayLesson();
            lesson.setSubject(s.getSubject().getName());
            lesson.setGroup(s.getGroup().getName());
            lesson.setTeacher(s.getTeacher().getName());
            lesson.setHomeWork(s.getAdditionalInfo().getHomework());
            lesson.setTitle(s.getAdditionalInfo().getTitle());
            lesson.setTime(s.getTime().getStart());
            lesson.setRoom(s.getRoom().getCode());
            lesson.setGrade(0);
            lesson.setAttendance(false);
            studentTodayLessons.add(lesson);
        }
        return studentTodayLessons;
    }

    @Override
    public List<StudentLessonList> getLessonList(Integer studentId, EduYear eduYear) {
        List<StudentLessonList> lessonList = new ArrayList<>();
        Student student = studentRepository.findById(studentId).orElse(null);
        List<Schedule> schedules = scheduleRepository.findAllByGroupIdAndEduYear(student.getClass_id(), eduYear);
        for (Schedule s: schedules) {
            StudentLessonList lesson = new StudentLessonList();
            lesson.setSubject(s.getSubject().getName());
            lesson.setTeacher(s.getTeacher().getName());
            lesson.setEduYear(eduYear);
            lessonList.add(lesson);
        }
        lessonList = lessonList.stream().distinct().collect(Collectors.toList());
        return lessonList;
    }

}*/
