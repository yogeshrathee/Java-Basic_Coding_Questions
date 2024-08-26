package org.example.JavaCourse.Challenge_5;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principle=sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double simpleInterest=(principle*rate*time)/100;
        System.out.println(simpleInterest);

        double totalAmount = principle+simpleInterest;
        System.out.println(totalAmount);
    }
}
