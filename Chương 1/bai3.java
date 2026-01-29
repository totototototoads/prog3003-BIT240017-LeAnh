package com.mycompany.bai3;

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}

public class bai3 {
    public static void main(String[] args) {
        Pair<String, Integer> studentID =
                new OrderedPair<>("MSSV", 10170);
        System.out.println(studentID.getKey() + " = " + studentID.getValue());

        Pair<String, String> studentName =
                new OrderedPair<>("HoTen", "Nguyen Thi Hoa");
        System.out.println(studentName.getKey() + " = " + studentName.getValue());
    }
}
