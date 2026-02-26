/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Bai1 {
    // Sửa lại cho đúng môi trường của bạn
    private static final String DB_URL  = "jdbc:mysql://localhost:3306/your_db?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "123456";

    public static void main(String[] args) {
        String sql = "SELECT * FROM users";

        // try-with-resources để tự đóng Connection/Statement/ResultSet
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");

                System.out.println(id + " - " + username + " - " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}