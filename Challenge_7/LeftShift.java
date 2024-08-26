package org.example.JavaCourse.Challenge_7;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        int result = input<<1; //1:- shift in one position
          int result1=input<<2; //2:- shift in two positions
        System.out.println("leftShift operator result:: "+result);
        System.out.println("leftShift operator result:: "+result1);
    }
}
