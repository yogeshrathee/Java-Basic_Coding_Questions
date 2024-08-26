package org.example.JavaCourse.Challenge_7;

import java.util.Scanner;

public class EvenOddByBitwiseOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();


        if((input & 1) == 1){
            System.out.println(input+" is odd number");
        }
        else{
            System.out.println(input+" is even number");
        }
    }
}
