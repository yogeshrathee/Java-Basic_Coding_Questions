package org.example.JavaCourse.Challenge_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number =sc.nextInt();
        Patterns.rightHalfPyramid(number);
        System.out.println();
        Patterns.reverseRightPyramid(number);
        System.out.println();
        Patterns.leftHalfPyramid(number);
    }
}
