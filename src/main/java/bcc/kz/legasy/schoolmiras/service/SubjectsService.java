package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Roles;
import bcc.kz.legasy.schoolmiras.model.Subjects;

import java.util.List;

public interface SubjectsService {
    Subjects create(Subjects subjects);

    Subjects getById(Integer id);

    List<Subjects> getAll();

    void delete(Integer id);
}
