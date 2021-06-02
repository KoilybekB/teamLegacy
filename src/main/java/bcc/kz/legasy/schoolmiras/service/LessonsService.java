package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Lessons;

import java.util.List;

public interface LessonsService {
    Lessons create(Lessons lessons);

    Lessons getById(Integer id);

    List<Lessons> getAll();

    void delete(Integer id);
}
