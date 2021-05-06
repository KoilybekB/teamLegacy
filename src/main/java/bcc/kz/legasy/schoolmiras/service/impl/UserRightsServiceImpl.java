package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Classes;
import bcc.kz.legasy.schoolmiras.model.UserRights;
import bcc.kz.legasy.schoolmiras.repository.ClassesRepository;
import bcc.kz.legasy.schoolmiras.repository.UserRightsRepository;
import bcc.kz.legasy.schoolmiras.service.UserRightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRightsServiceImpl implements UserRightsService {
    @Autowired
    private UserRightsRepository userRightsRepository;

    @Override
    public UserRights create(UserRights userRights) {
        return userRightsRepository.save(userRights);
    }

    @Override
    public UserRights getById(Integer id) {
        Optional<UserRights> optionalUserRights = userRightsRepository.findById(id);
        if (optionalUserRights.isPresent()) {
            return userRightsRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<UserRights> getAll() {
        return userRightsRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        UserRights userRights = getById(id);
        if (userRights != null)
            userRightsRepository.delete(userRights);
    }

}
