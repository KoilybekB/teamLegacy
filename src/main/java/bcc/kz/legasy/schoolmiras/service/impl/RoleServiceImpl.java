package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Role;
import bcc.kz.legasy.schoolmiras.repository.RoleRepository;
import bcc.kz.legasy.schoolmiras.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository rolesRepository;

    @Override
    public Role create(Role roles) {
        return rolesRepository.save(roles);
    }

    @Override
    public Role getById(Integer id) {
        Optional<Role> optionalRoles = rolesRepository.findById(id);
        if (optionalRoles.isPresent()) {
            return rolesRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Role> getAll() {
        return rolesRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Role roles = getById(id);
        if (roles != null)
            rolesRepository.delete(roles);
    }

}
