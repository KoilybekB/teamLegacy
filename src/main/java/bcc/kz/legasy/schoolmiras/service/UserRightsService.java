package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Roles;
import bcc.kz.legasy.schoolmiras.model.UserRights;

import java.util.List;

public interface UserRightsService {
    UserRights create(UserRights userRights);

    UserRights getById(Integer id);

    List<UserRights> getAll();

    void delete(Integer id);
}
