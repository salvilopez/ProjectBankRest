package com.project.ssl.projectbank.service;

import com.project.ssl.projectbank.model.User;

import java.util.List;

public interface IUserService {
    public List<User> findAllUsers();
    public User findUserById(Long id);
    public User save(User user);
    public void deleteById(Long id);
    public void update(Long id,User usuario);
}
