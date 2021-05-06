package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.Staff;
import bcc.kz.legasy.schoolmiras.model.Users;
import bcc.kz.legasy.schoolmiras.repository.UsersRepository;
import bcc.kz.legasy.schoolmiras.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private  UsersRepository usersRepository;

    @Override
    public Users create(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public Users getById(Integer id) {
        Optional<Users> optionalUsers = usersRepository.findById(id);
        if (optionalUsers.isPresent()) {
            return usersRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Users users = getById(id);
        if (users != null)
            usersRepository.delete(users);
    }

}
