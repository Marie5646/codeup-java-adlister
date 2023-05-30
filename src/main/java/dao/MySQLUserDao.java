package dao;

import com.mysql.cj.jdbc.Driver;
import models.User;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUserDao implements Users {
    private Connection connection = null;
    public MySQLUserDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }


    @Override
    public List<User> findByUsername(String username) {
        try {
            Statement stmt = connection.createStatement();

            String selectUsers = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(selectUsers);
            List<User> newUser = new ArrayList<>();
            while (rs.next()) {
                newUser.add(new User(rs.getString("username"), rs.getString("password"), rs.getString("email")));
            }
            return newUser;
        } catch (SQLException e) {
            throw new RuntimeException("Error finding user");
        }
    }

    @Override
    public Long insertUser(User user) {
        try {
            String insertQuery = String.format("INSERT INTO ads (id, username, password, email) VALUES('%s','%s','%s')", user.getId(), user.getUsername(), user.getPassword(), user.getEmail());
            PreparedStatement stmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = stmt.getGeneratedKeys();
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());

            if (rs.next()) {
                System.out.println("New User inserted");
            }
            return rs.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error adding user to the database");

        }
    }
    private User extractUser(ResultSet rs) throws SQLException {
        if(! rs.next()){
            return null;
        }
        return new User(
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("email")

        );
    }
}
