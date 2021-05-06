package bcc.kz.legasy.schoolmiras.service;

import bcc.kz.legasy.schoolmiras.model.Staff;

import java.util.List;

public interface StaffService {
    Staff create(Staff staff);

    Staff getById(Integer id);

    List<Staff> getAll();

    void delete(Integer id);
}
