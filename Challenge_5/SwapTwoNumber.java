package org.example.JavaCourse.Challenge_5;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        System.out.println(firstNumber+" "+secondNumber);


    //by the using  of third number
        int tempNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tempNumber;

        System.out.println(firstNumber+" "+secondNumber);


    //without using of third number
        firstNumber = firstNumber+secondNumber;
        secondNumber = firstNumber-secondNumber;
        firstNumber = firstNumber-secondNumber;

        System.out.println(firstNumber+" "+secondNumber);
    }
}
