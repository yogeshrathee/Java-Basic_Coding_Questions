package org.example.JavaCourse.Challenge_9.CalculateFactorial;

public class Factorial {
    public static int calFact(int number){
        int factSum=1;

        if(number<2){
            return 1;
        }
        else {
            for (int i = 2; i <= number; i++) {
                factSum *= i;
            }
        }

        return factSum;
    }
}
