package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Users;

import java.util.List;

public interface UsersService {
    Users create(Users users);

    Users getById(Integer id);

    List<Users> getAll();

    void delete(Integer id);
}
