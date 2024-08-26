package org.example.JavaCourse.Challenge_6;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();
        if(age<=13){
            System.out.println("Child");
        }
        else if(age<=20){
            System.out.println("Teen");
        }
        else if(age<=60){
            System.out.println("Aduit");
        }
        else {
            System.out.println("Senior");
        }
    }
}
