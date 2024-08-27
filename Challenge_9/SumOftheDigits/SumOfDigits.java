package org.example.JavaCourse.Challenge_9.SumOftheDigits;

public class SumOfDigits {
    public static int sumDigit(int number){
        int sum=0;
//        int lastDigit=0;
        while(number>0){

            sum += number % 10;  /* lastDigit=number % 10;
                                     sum += lastDigit;

                                      both make one statement:-> sum += number%10;
                                  */
            number /= 10;
        }

        return sum;
    }
}
