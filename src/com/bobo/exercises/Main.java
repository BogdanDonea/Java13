package com.bobo.exercises;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        System.out.println(numbers.indexOf(400));
        numbers.removeAt(0);
        System.out.println(numbers.indexOf(40));


        numbers.print();
    }
}
