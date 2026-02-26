/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bai2 {
    // Sửa lại cho đúng DB của bạn
    private static final String DB_URL  = "jdbc:mysql://localhost:3306/your_db?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "your_password";

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Cách dùng: java DeleteUserByIdJdbc <id>");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("id phải là số nguyên.");
            return;
        }

        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            int affectedRows = ps.executeUpdate(); // số dòng bị ảnh hưởng

            if (affectedRows == 0) {
                System.out.println("Không tìm thấy user để xóa");
            } else {
                System.out.println("Đã xóa user có id = " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}