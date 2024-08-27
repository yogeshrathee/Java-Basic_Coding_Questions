package org.example.JavaCourse.Challenge_10.PrimeNumber;

public class CrossCheckPrime {
    public static boolean isPrime(int number){
        if(number == 0 || number == 1){
           return false;
        }
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number % i == 0 ){
                    return false;
                }
            }
        }
        return true;
    }
}
