package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.User;

import java.util.List;

public interface UserService {
    User create(User users);

    User getById(Integer id);

    List<User> getAll();

    void delete(Integer id);
}
