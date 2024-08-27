package org.example.JavaCourse.Challenge_9.MultiplicationTable;

import java.util.Scanner;

public class MultiTable {
    static Scanner sc=new Scanner(System.in);
    public static int inputReader(){
       return sc.nextInt();
    }

    public static void displayResult(int num){
       int i=1;
        while(i<=10){
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }
    }
}
