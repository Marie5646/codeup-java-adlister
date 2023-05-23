package models;

import models.User;

import java.sql.SQLException;
import java.util.List;

public interface Users {
    List<User> all() throws SQLException;

    void insertUser(User user);
}
