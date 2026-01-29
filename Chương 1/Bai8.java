/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai8;
import java.util.HashMap;
/**
 *
 * @author 40C LTN
 */
public class Bai8 {

    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        
        employees.put(101,"Anna");
        employees.put(102,"Peter");
        employees.put(103,"Mary");
        
        String name102 = employees.get(102);
        System.out.println("Nhan vien ID102: " + name102);
        
        if(!employees.containsKey(105)){
            employees.put(105,"Unknown");
            System.out.println("Da them nhan vien ID105");
        }
        
        System.out.println("Danh sach nhan vien");
        System.out.println(employees);
    }
}
