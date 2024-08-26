package org.example.JavaCourse.Challenge_6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();

        if((input % 4 ==0 && input % 100 !=0) || input % 400 == 0){
            System.out.println(input+" is a leap year");
        }
        else{
            System.out.println(input+" is not a leap year");
        }
    }
}
