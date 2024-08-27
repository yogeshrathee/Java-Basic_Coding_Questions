package org.example.JavaCourse.Challenge_8.Addition;

import java.util.Scanner;

import static org.example.JavaCourse.Challenge_8.Addition.ReadNumber.readNumber;
import static org.example.JavaCourse.Challenge_8.Addition.Sum.sum;

public class Main {
    public static void main(String[] args) {
        int num1=readNumber();
        int num2=readNumber();

        System.out.println(sum(num1,num2));

    }
}
