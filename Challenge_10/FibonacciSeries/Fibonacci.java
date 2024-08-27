package org.example.JavaCourse.Challenge_10.FibonacciSeries;

public class Fibonacci {
    public static void fibonacciSeries(int number){
        int firstNumber=0,secondNumber=1;
        if(number<0 || number == 0) return;

        System.out.print(firstNumber+" ");

        if(number == 1) return;
        System.out.print(secondNumber+" ");

            for (int i = 1; i < number; i++) {
                if (firstNumber + secondNumber <=number) {
                    int nextNumber = firstNumber + secondNumber;
                    System.out.print(nextNumber+" ");
                    firstNumber = secondNumber;
                    secondNumber = nextNumber;
                } else {
                    return;
                }
            }

    }
}
