package com.mycompany.bai1;


public class Bai1 {
    public static void main(String[] args) {

        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.connect();

        // kiểm tra có phải cùng 1 instance không
        System.out.println(db1 == db2); // true
    }
}
