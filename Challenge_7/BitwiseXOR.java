package org.example.JavaCourse.Challenge_7;

import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();

        int result= firstNumber ^ secondNumber;
        System.out.println("Bitwise XOR operator result:: "+result);
    }
}
