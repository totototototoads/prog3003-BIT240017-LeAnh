/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5;

/**
 *
 * @author 40C LTN
 */
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Bai5 {
    public static void main(String[] args) {

        Supplier<Double> randomNumber =
                () -> Math.random() * 100;

        Consumer<Double> printNumber =
                n -> System.out.println("Số may mắn: " + n);

        Double number = randomNumber.get();
        printNumber.accept(number);
    }
}

