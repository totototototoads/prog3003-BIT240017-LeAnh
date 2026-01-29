/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6;
import java.util.HashSet;
/**
 *
 * @author 40C LTN
 */
public class Bai6 {

    public static void main(String[] args) {
        int[] numbers = {5,2,9,2,5,8,1};
        
        HashSet<Integer> set = new HashSet<>();
        for (int n : numbers){
            set.add(n);
        }
        
        System.out.println("Cac thanh phan duy nhat trong HashSet:");
        System.out.println(set);
    }
}
