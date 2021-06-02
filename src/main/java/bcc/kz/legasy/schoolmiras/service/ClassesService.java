package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Classes;

import java.util.List;

public interface ClassesService {
    Classes create(Classes classes);

    Classes getById(Integer id);

    List<Classes> getAll();

    void delete(Integer id);
}
