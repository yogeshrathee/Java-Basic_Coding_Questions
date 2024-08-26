package org.example.JavaCourse.Challenge_6;

import java.util.Scanner;

public class DetermineNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        if(input==0){
            System.out.println(input+" is zero");
        }
        else if(input>0){
            System.out.println(input+" is positive number");
        }
        else {
            System.out.println(input+" is negative number");
        }
    }
}
