package bcc.kz.legasy.schoolmiras.model.dto.student;

import lombok.Data;

@Data
public class LessonItem {
    private String name;
    private String teacher;
    private String teacherln;
    private String classRoom;
    private String group;
    private Integer timetableId;
    private boolean free;
    private Integer room_Id;
}
