package bcc.kz.legasy.schoolmiras.service.impl;

import bcc.kz.legasy.schoolmiras.model.User;
import bcc.kz.legasy.schoolmiras.repository.UserRepository;
import bcc.kz.legasy.schoolmiras.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User users) {
        return userRepository.save(users);
    }

    @Override
    public User getById(Integer id) {
        Optional<User> optionalUsers = userRepository.findById(id);
        if (optionalUsers.isPresent()) {
            return userRepository.findById(id).get();
        } else {
            return null;
        }
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User users = userRepository.getUserByLogin(s);
        if (users == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return users;
    }

}
