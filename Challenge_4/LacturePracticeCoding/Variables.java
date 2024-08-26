package org.example.JavaCourse.Challenge_4.LacturePracticeCoding;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = sc.nextInt();
        int yourNumber = myNumber;
        System.out.println(yourNumber);

        System.out.println("hello\bYogesh");
        System.out.println("hello\tYogesh");
        System.out.println("hello\'yogesh\'");
        System.out.println("hello\"yogesh\"");
        System.out.println("hello\\Yogesh\\");
    }
}
