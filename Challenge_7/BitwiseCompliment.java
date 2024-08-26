package org.example.JavaCourse.Challenge_7;

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        int result= ~input;
        System.out.println("Bitwise Complement operator result:: "+result);
    }
}
