package com.mycompany.bai1;

public class DatabaseConnection {

    // 2. Biến static lưu instance duy nhất
    private static DatabaseConnection instance;

    // 1. Constructor private
    private DatabaseConnection() {
        System.out.println("Kết nối Database được tạo!");
    }

    // 3. Phương thức getInstance()
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Đang kết nối Database...");
    }
}
