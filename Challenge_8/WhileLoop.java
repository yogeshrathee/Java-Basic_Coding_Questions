package org.example.JavaCourse.Challenge_8;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int input=sc.nextInt();

        //print first 10 number of a number
        while(input<=10){
            System.out.println(input);
            input +=1;
        }

        //start to any number or end to any number , its user define number
        int startCount=sc.nextInt();
        int endCount=sc.nextInt();

        while(startCount<=endCount){
            System.out.println(startCount);
            startCount++;
        }


        //reverse print of any number which user provide the start point or end point
        int startCount1=sc.nextInt();
        int endCount1=sc.nextInt();
        while(startCount1>=endCount1){
            System.out.println(startCount1);
            startCount1--;
        }

        //print number user manually, i want to enter the 5 number of my choice
        int i=1;
        while(i<=5){
            int num=sc.nextInt();
            System.out.println(i+" is "+num);
            i++;
        }
    }
}
