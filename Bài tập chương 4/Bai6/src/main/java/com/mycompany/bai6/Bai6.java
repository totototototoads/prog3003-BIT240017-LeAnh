/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6;

/**
 *
 * @author 40C LTN
 */
import java.util.Arrays;
import java.util.List;

public class Bai6 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)     // lọc số chẵn
                .map(n -> n * n)             // bình phương
                .reduce(0, Integer::sum);    // tính tổng

        System.out.println("Tổng = " + sum);
    }
}
