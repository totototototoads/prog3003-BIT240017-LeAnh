/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2;

/**
 *
 * @author 40C LTN
 */
import java.util.*;

public class Bai2 {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "Hanoi", "Ho Chi Minh", "Da Nang", "Hue"
        );

        // Sắp xếp theo độ dài (ngắn -> dài)
        Collections.sort(cities, (a, b) -> a.length() - b.length());

        System.out.println(cities);
    }
}
