package com.mycompany.bai2;

public class Bai2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new NumberThread("Thread-" + i).start();
        }
    }
}