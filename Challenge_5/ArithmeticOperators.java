package org.example.JavaCourse.Challenge_5;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();

        int secondNumber= sc.nextInt();
        if(secondNumber<firstNumber){
            System.out.println("Sum:: "+(firstNumber+secondNumber));
            System.out.println("Subtraction:: "+(firstNumber-secondNumber));
            System.out.println("Multiplication:: "+(firstNumber*secondNumber));
            System.out.println("Division:: "+(firstNumber/secondNumber));
            System.out.println("Remainder:: "+(firstNumber%secondNumber));
        }
        else{
            System.out.println("Enter the second number always less then first number !!");
        }

    }
}
