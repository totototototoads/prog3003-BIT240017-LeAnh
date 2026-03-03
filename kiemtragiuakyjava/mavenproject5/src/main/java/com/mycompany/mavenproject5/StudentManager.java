/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author 40C LTN
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager<T> { 
    private final List<T> data;  

    public StudentManager() {
        this.data = new ArrayList<>();
    }

    public void add(T item) {
        data.add(item);
    }

    
    public List<T> getAll() {
        return Collections.unmodifiableList(data);
    }
}