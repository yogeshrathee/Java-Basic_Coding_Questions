package org.example.JavaCourse.Challenge_10.PrimeNumber;

public class Prime {
    public static void primeNumber(int number) {

        int flag=0;
        if((number == 0)||(number == 1)){
            System.out.println(number+" is not prime");
        }else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.println(number+" is not prime");
                    flag=1;
                    break;
                }
            }
        }

        if(flag == 0){
            System.out.println(number +" is prime number");
        }
    }
}
