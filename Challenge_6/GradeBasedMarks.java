package org.example.JavaCourse.Challenge_6;

import java.util.Scanner;

public class GradeBasedMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade>=90){
            System.out.println("A");
        }
        else if(grade>=75){
            System.out.println("B");
        }
        else if(grade>=60){
            System.out.println("C");
        }
        else if(grade>=30){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
