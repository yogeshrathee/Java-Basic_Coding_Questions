package org.example.JavaCourse.Challenge_10.FibonacciSeries;

import org.example.JavaCourse.Challenge_10.PrimeNumber.InputReader;

public class Main {
    public static void main(String[] args) {
        int input= InputReader.inputReader();

        Fibonacci.fibonacciSeries(input);
    }
}
