package org.example.JavaCourse.Challenge_5;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double lengthSide_1 = sc.nextDouble();
        double lengthSide_2 = sc.nextDouble();
        double breadthSide_1 = sc.nextDouble();
        double breadthSide_2 = sc.nextDouble();

        double perRect=lengthSide_1+lengthSide_2+breadthSide_1+breadthSide_2;
        System.out.println(perRect);
    }
}
