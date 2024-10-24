package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    private static final String URL = "jdbc:postgresql://localhost:5433/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {

            String sql = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                User userObj = new User();
                userObj.setId(resultSet.getInt("id"));
                userObj.setUsername(resultSet.getString("username"));
                userObj.setEmail(resultSet.getString("email"));
                userObj.setCreatedAt(resultSet.getString("created_at"));
                users.add(userObj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users; // Возвращаем список пользователей в виде JSON
    }
}
