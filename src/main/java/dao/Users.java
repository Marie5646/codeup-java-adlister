package dao;

import models.User;

import java.util.List;

public interface Users {
    List<User> findByUsername(String username);
    Long insertUser(User user);
}
