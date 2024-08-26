package org.example.JavaCourse.Challenge_7;

import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();

        int result = firstNumber & secondNumber; //& :-> bitwise and operator

        System.out.println("Bitwise AND operator result:: "+result);
    }
}
