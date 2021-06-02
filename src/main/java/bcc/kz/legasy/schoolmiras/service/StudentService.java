package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Student;

import java.util.List;

public interface StudentService {
    Student create(Student student);

    Student getById(Integer id);

    List<Student> getAll();

    void delete(Integer id);
}
