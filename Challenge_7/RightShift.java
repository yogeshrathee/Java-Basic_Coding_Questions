package org.example.JavaCourse.Challenge_7;

import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        int result = input>>1;
        System.out.println("RightShift operator result:: "+result);
    }
}
