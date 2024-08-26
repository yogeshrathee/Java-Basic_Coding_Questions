package org.example.JavaCourse.Challenge_6;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        int thirdNumber=sc.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("Greatest number is "+firstNumber);
        }
        else if(secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("Greatest Number is "+secondNumber);
        }else{
            System.out.println("Greatest Number is "+thirdNumber);
        }
    }
}
