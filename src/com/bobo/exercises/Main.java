package com.bobo.exercises;

public class Main {
    public static void main(String[] args) {

        // Array class test

        Array numbers = new Array(3);

        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);

        System.out.println(numbers.indexOf(400));

        numbers.removeAt(0);

        System.out.println(numbers.indexOf(40));

        numbers.print();

        // LinkedList class test

        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.addLast(40);
        list.removeFirst();

        System.out.println(list.indexOf(100));
        System.out.println(list.contains(50));


    }
}
