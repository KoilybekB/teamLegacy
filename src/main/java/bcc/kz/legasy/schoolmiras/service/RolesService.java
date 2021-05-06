package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Roles;

import java.util.List;

public interface RolesService {
    Roles create(Roles roles);

    Roles getById(Integer id);

    List<Roles> getAll();

    void delete(Integer id);
}
