package org.example.JavaCourse.Challenge_4.LacturePracticeCoding;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int num1=sc.nextInt();

        System.out.println("Sum:: "+(num+num1)+"\nsubtraction:: "
                +(num-num1)+"\nMultiplication:: "+(num*num1)+"\nDivision:: "
                +(num/num1)+"\nRemainder:: "+(num%num1));

        
    }
}
