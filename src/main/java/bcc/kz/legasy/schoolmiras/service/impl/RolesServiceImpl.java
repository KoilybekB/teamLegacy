package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Roles;
import bcc.kz.legasy.schoolmiras.model.Staff;
import bcc.kz.legasy.schoolmiras.repository.RolesRepository;
import bcc.kz.legasy.schoolmiras.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public Roles create(Roles roles) {
        return rolesRepository.save(roles);
    }

    @Override
    public Roles getById(Integer id) {
        Optional<Roles> optionalRoles = rolesRepository.findById(id);
        if (optionalRoles.isPresent()) {
            return rolesRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Roles> getAll() {
        return rolesRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Roles roles = getById(id);
        if (roles != null)
            rolesRepository.delete(roles);
    }

}
