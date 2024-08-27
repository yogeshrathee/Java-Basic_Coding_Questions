package org.example.JavaCourse.Challenge_9.LeastCommonMultipleAndGreatestCommonDivisor;

public class FindGCD {
    public static int findGCD(int firstNumber, int secondNumber){

        int gcd=1;
        int leastValue=least(firstNumber,secondNumber);
        for(int i=2;i<=leastValue;i++) {
            if((firstNumber % i == 0) && (secondNumber % i==0)){
                gcd = i;
            }

        }
       return gcd;
    }

    public static int least(int firstNumber, int secondNumber){
        return Math.max(firstNumber, secondNumber);
    }
}
