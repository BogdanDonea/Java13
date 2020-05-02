package com.bobo.exercises;



public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 35, 4, 5};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}
