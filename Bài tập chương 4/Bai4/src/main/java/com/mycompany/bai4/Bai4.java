/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4;

/**
 *
 * @author 40C LTN
 */
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Bai4 {
    public static void main(String[] args) {

        List<String> moneyList = Arrays.asList("$10", "$20", "$50");

        Function<String, Integer> convert =
                s -> Integer.parseInt(s.substring(1));

        List<Integer> numbers = moneyList.stream()
                .map(convert)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}

