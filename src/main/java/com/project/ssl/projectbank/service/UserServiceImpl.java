package com.project.ssl.projectbank.service;

import com.project.ssl.projectbank.model.User;
import com.project.ssl.projectbank.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{


    @Autowired
    IUserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(Long id,User user) {
        if(id!=null) {
            User userActual = userRepository.findById(id).get();
            userActual.setUsername(user.getUsername());
            userActual.setPassword(user.getPassword());
            userActual.setName(user.getName());
            userActual.setLastName(user.getLastName());
            userActual.setEmail(user.getEmail());
            userActual.setFechaRegistro(user.getFechaRegistro());
            userRepository.save(userActual);
        }
    }
}
