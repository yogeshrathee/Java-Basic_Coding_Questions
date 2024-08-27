package org.example.JavaCourse.Challenge_10.ReverseDigitsOfANumber;

import org.example.JavaCourse.Challenge_10.PrimeNumber.InputReader;

public class Main {
    public static void main(String[] args) {
        int input= InputReader.inputReader();

        System.out.println(ReverseDigits.reverseDigit(input));
    }
}
