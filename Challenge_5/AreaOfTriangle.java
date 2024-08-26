package org.example.JavaCourse.Challenge_5;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double breadthSide=sc.nextDouble();
        double heightSide=sc.nextDouble();

        double areaTriangle=(breadthSide*heightSide)/2;
        System.out.println(areaTriangle);

    }
}
