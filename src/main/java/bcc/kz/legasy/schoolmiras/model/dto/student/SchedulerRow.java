package bcc.kz.legasy.schoolmiras.model.dto.student;

import lombok.Data;

@Data
public class SchedulerRow {
    private String time;
    private LessonItem l1;
    private LessonItem l2;
    private LessonItem l3;
    private LessonItem l4;
    private LessonItem l5;
    private LessonItem l6;
}
