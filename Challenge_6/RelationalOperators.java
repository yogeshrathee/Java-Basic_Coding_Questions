package org.example.JavaCourse.Challenge_6;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:: ");
        String candidateName = sc.nextLine();

        System.out.print(candidateName+", what is your age:: ");
        int candidateAge=sc.nextInt();

        if(candidateAge>=18){
            System.out.println("Congratulations! "+candidateName+", you are eligible for applying the driving license !!");
        }
        else {
            System.out.println("Sorry! "+candidateName+", you are not eligible for applying the driving license !!");
        }
    }
}
