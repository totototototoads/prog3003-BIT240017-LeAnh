package com.mycompany.bai1;

public class Bai1 {
    public static void main(String[] args) {

        // Cộng
        MathOperation add = (a, b) -> a + b;

        // Trừ
        MathOperation subtract = (a, b) -> a - b;

        // Nhân
        MathOperation multiply = (a, b) -> a * b;

        // Chia
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Không thể chia cho 0!");
                return 0;
            }
            return a / b;
        };

        int x = 10;
        int y = 5;

        System.out.println("Cộng: " + add.compute(x, y));
        System.out.println("Trừ: " + subtract.compute(x, y));
        System.out.println("Nhân: " + multiply.compute(x, y));
        System.out.println("Chia: " + divide.compute(x, y));
    }
}
