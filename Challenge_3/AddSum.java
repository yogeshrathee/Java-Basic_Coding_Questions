package org.example.JavaCourse.Challenge_3;

import java.util.Scanner;

public class AddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value 1 :: ");
        int firstNum=sc.nextInt();
        System.out.print("Enter the value 2 :: ");
        int secondNum=sc.nextInt();

        int sum=firstNum+secondNum;
        System.out.println("sum of "+firstNum+" and "+secondNum+" is "+sum);

    }
}
