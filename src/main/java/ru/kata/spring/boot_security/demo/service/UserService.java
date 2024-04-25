package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.Models.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> getAll();
    void update(User user);

    void removeById(Long id);

    User getById(Long id);
}
