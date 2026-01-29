/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai7;
import java.util.TreeSet;
/**
 *
 * @author 40C LTN
 */
public class Bai7 {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        
        System.out.println("Danh sach sau khi sap xep: ");
        System.out.println(names);
        
        String first = names.first();
        String last = names.last();
        
        System.out.println("Phan tu nho nhat: " + first);
        System.out.println("Phan tu lon nhat: " + last);
    }
}
