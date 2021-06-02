package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Role;

import java.util.List;

public interface RoleService {
    Role create(Role roles);

    Role getById(Integer id);

    List<Role> getAll();

    void delete(Integer id);
}
