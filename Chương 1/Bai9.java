/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai9;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author 40C LTN
 */
public class Bai9 {

    public static void main(String[] args) {
        TreeMap<String,Double> products = new TreeMap<>();
        
        products.put("Laptop",1500.0);
        products.put("Mouse",25.0);
        products.put("Keyboảd",50.0);
        
        System.out.println("Danh sach san pham:");
        System.out.println(products);
        
        Map<String,Double> subProducts = products.subMap("K","N");
        
        System.out.println("San pham tu k den N");
        System.out.println(subProducts);
    }
}
