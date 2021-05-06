package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Staff;
import bcc.kz.legasy.schoolmiras.repository.StaffRepository;
import bcc.kz.legasy.schoolmiras.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff create(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public Staff getById(Integer id) {
        Optional<Staff> optionalStaff = staffRepository.findById(id);
        if (optionalStaff.isPresent()) {
            return staffRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Staff> getAll() {
        return staffRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Staff staff = getById(id);
        if (staff != null)
            staffRepository.delete(staff);
    }
}
