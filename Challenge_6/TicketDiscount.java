package org.example.JavaCourse.Challenge_6;

import java.util.Scanner;

public class TicketDiscount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int totalDistance= (int) (200*Math.random());

        System.out.print("Enter your name:: ");
        String candidateName = sc.nextLine();

        System.out.print(candidateName+" enter your age:: ");
        int candidateAge=sc.nextInt();

        System.out.print("last station:: ");
        sc.nextLine();
        String lastStation=sc.nextLine();

        System.out.println("Total price of ticket:: "+totalDistance+" Rupees");

        System.out.print("Enter your Gender:: ");
        String candidateGender=sc.next();
        boolean isMale=candidateGender.toUpperCase().equalsIgnoreCase("male");
        boolean isFemale=candidateGender.toUpperCase().equalsIgnoreCase("female");

        if(isMale){
            System.out.println("20 percentage relaxation (gender)!!");
            if(candidateAge>=0 && candidateAge<5){
                System.out.println("15 percentage relaxation (Age)!!");

                int pay=(totalDistance*40)/100;
                int totalPay = totalDistance - pay;
                if(totalPay<1) {
                    System.out.println("Zero Rupees \nHappy Journey");
                }
                else {
                    System.out.print("Pay only:: " + totalPay + " Rupees\nHappy Journey!! ");
                }
            }
            else if(candidateAge>=5 && candidateAge<18){
                System.out.println("10 percentage relaxation (Age)!!");

                int pay=(totalDistance*30)/100;
                int totalPay = totalDistance - pay;
                if(totalPay<1) {
                    System.out.println("Zero Rupees \nHappy Journey");
                }
                else {
                    System.out.print("Pay only:: " + totalPay + " Rupees\nHappy Journey!! ");
                }
            }

            else if(candidateAge>=18 && candidateAge<=60){
                System.out.println("5 percentage relaxation (Age)!!");

                int pay=(totalDistance*25)/100;
                int totalPay = totalDistance - pay;
                if(totalPay<1) {
                    System.out.println("Zero Rupees \nHappy Journey");
                }
                else {
                    System.out.print("Pay only:: " + totalPay + " Rupees\nHappy Journey!! ");
                }
            }

            else if(candidateAge>60){
                System.out.println("30 percentage relaxation (Age)!!");

                int pay=(totalDistance*50)/100;
                int totalPay = totalDistance - pay;
                if(totalPay<1) {
                    System.out.println("Zero Rupees \nHappy Journey");
                }
                else {
                    System.out.print("Pay only:: " + totalPay + " Rupees\nHappy Journey!! ");
                }
            }

        }


        if(isFemale){
            System.out.println("30 percentage relaxation (gender)!!");
            if(candidateAge>=0 && candidateAge<5){
                System.out.println("20 percentage relaxation (Age)!!");

                int pay=(totalDistance*50)/100;
                int totalPay = totalDistance - pay;
                if(totalPay<1) {
                    System.out.println("Zero Rupees \nHappy Journey");
                }
                else {
                    System.out.print("Pay only:: " + totalPay + " Rupees\nHappy Journey!! ");
                }
            }
            else if(candidateAge>=5 && candidateAge<18){
                System.out.println("15 percentage relaxation (Age)!!");

                int pay=(totalDistance*45)/100;
                int totalPay = totalDistance - pay;
                if(totalPay<1) {
                    System.out.println("Zero Rupees \nHappy Journey");
                }
                else {
                    System.out.print("Pay only:: " + totalPay + " Rupees\nHappy Journey!! ");
                }
            }

            else if(candidateAge>=18 && candidateAge<=60){
                System.out.println("10 percentage relaxation (Age)!!");

                int pay=(totalDistance*40)/100;
                int totalPay = totalDistance - pay;
                if(totalPay<1) {
                    System.out.println("Zero Rupees \nHappy Journey");
                }
                else {
                    System.out.print("Pay only:: " + totalPay + " Rupees\nHappy Journey!! ");
                }
            }

            else if(candidateAge>60){
                System.out.println("40 percentage relaxation (Age)!!");

                int pay=(totalDistance*70)/100;
                int totalPay = totalDistance - pay;
                if(totalPay<1) {
                    System.out.println("Zero Rupees \nHappy Journey");
                }
                else {
                    System.out.print("Pay only:: " + totalPay + " Rupees\nHappy Journey!! ");
                }
            }

        }






    }
}
