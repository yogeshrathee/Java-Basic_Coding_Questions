package org.example.JavaCourse.Challenge_4.LacturePracticeCoding;

import java.util.Scanner;

public class ShorthandOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        input +=2; //input=input+2;
        System.out.println(input);

        input -=2; //input=input-2;
        System.out.println(input);

        input *=2; //input=input*2;
        System.out.println(input);

        input /=2; //input=input/2;
        System.out.println(input);

        input %=2; //input=input%2;
        System.out.println(input);
    }
}
