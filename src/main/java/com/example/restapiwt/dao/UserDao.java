package com.example.restapiwt.dao;

import com.example.restapiwt.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getById(Long id);

    User getByLogin(String email);

    void save(User user);

    void update(User updatedUser);

    void delete(Long id);
}
