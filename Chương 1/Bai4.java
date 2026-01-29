/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.bai4;
/**
 *
 * @author 40C LTN
 */

import java.util.ArrayList;

public class Bai4 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        
        fruits.add(1,"Mango");
        
        int indexBanana = fruits.indexOf("Banana");
        if (indexBanana != -1){
            fruits.set(indexBanana,"Grapes");
        }
        
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Apple co ton tai khong?" + hasApple);
        
        System.out.println("Danh sach trai cay: " + fruits);
    }
}
