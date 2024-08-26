package org.example.JavaCourse.Challenge_6;

import java.util.Scanner;

public class LearningIfOrIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name:: ");
        String name=sc.nextLine();
        System.out.print(name+" , you are male or female (enter true or false):: ");
        boolean isMale=sc.nextBoolean();

        if(isMale) {
                System.out.print(name+" , you are a male, \nEnter your Father Name:: ");
                sc.nextLine();
                String maleFatherName = sc.nextLine();
                System.out.println(name+" , your Father Name is "+maleFatherName);
        }
        else{
            System.out.print(name+" , are you married or not (Enter true or false):: ");
            boolean isMarried=sc.nextBoolean();
            if(isMarried){
                System.out.print(name+" , you are female and also married, so \n enter your Husband Name:: ");
                sc.nextLine();
                String husbandName=sc.nextLine();
                System.out.println(name+" , your Husband Name is "+husbandName);
            }else{
                System.out.print(name+" , you are female,but you are not married, so \n enter your Father Name:: ");
                sc.nextLine();
                String femaleFatherName=sc.nextLine();
                System.out.println(name+" , your Father Name is "+femaleFatherName);
            }

        }


    }
}
