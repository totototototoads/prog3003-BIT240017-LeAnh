/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject5;

import java.util.Comparator;
import java.util.List;


/**
 *
 * @author 40C LTN
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    
    public static double calculateAverageGpa(List<Student> students) {
        if (students == null || students.isEmpty()) return 0.0;

        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
    }
    
    public static void main(String[] args) {
        StudentManager<Student> add = new StudentManager();
        add.add(new Student("BIT240017","leanh",2.5));
        add.add(new Student("BIT230494","đsd",2));
        add.add(new Student("BIT230223","fsda",3.5));
        
        System.out.println("=== DANH SACH SINH VIEN ===");
        add.getAll().forEach(System.out::println);
        
        
     
        System.out.println("\n=== SV CO GPA >= 3.2 (GIAM DAN) ===");
        add.getAll().stream()
                .filter(s -> s.getGpa() >= 3.2)
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .forEach(System.out::println);
        
    }
    
}
