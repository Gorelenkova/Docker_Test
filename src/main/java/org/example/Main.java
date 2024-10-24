package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
@SpringBootApplication
public class Main {
//    private static final String URL = "jdbc:postgresql://localhost:5433/postgres"; // Измените на ваш порт
//    private static final String USER = "postgres";
//    private static final String PASSWORD = "12345";
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//             Statement statement = connection.createStatement()) {
//
//            // Выполняем SQL-   запрос
//            String sql = "SELECT * FROM users"; // Ваш SQL-запрос
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            // Обрабатываем результаты запроса
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String username = resultSet.getString("username");
//                String email = resultSet.getString("email");
//                String createdAt = resultSet.getString("created_at");
//
//                // Выводим данные на консоль
//                System.out.println("ID: " + id + ", Username: " + username + ", Email: " + email + ", Created At: " + createdAt);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}



