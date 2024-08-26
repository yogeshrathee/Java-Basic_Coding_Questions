package org.example.JavaCourse.Challenge_4.LacturePracticeCoding;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int myInt = sc.nextInt();
        System.out.println(myInt);

        int yourInt = sc.nextInt();

        myInt = yourInt;
        System.out.println(yourInt+" "+myInt);
    }
}
