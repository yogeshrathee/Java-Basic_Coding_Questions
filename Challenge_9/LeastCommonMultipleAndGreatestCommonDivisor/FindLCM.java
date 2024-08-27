package org.example.JavaCourse.Challenge_9.LeastCommonMultipleAndGreatestCommonDivisor;

public class FindLCM {
    public static int findLCM(int firstNumber, int secondNumber){
       for(int i=1;i<=secondNumber;i++){
           int factor = firstNumber*i;
           if(factor % secondNumber == 0){
               return factor;
           }
       }
       return 0;

    }
}
