package org.example.JavaCourse.Challenge_5;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time=sc.nextDouble();

        double compoundInterest = principle*time*(1+rate/100);
        System.out.println(compoundInterest);

        double totalAmount=principle+compoundInterest;
        System.out.println(totalAmount);
    }
}
