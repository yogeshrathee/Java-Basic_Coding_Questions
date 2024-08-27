package org.example.JavaCourse.Challenge_10.PrimeNumber;


public class Main {
    public static void main(String[] args) {
        int input=InputReader.inputReader();



        if(CrossCheckPrime.isPrime(input)){
            Prime.primeNumber(input);
        }
        else{
            System.out.println(input+" is not prime");
        }

    }
}
