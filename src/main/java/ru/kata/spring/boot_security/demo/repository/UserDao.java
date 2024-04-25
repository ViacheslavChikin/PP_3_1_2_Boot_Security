package ru.kata.spring.boot_security.demo.repository;


import ru.kata.spring.boot_security.demo.Models.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> getAll();
    void update(User user);

    void removeById(Long id);

    User getById(Long id);
}
