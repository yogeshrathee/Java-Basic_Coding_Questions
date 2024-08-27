package org.example.JavaCourse.Challenge_11.ArmStrongNumber;

public class ArmStrong {
    public static void armStrong(int number) {
        if (digitsSum(number) == number) {
            System.out.println(number + " is ArmStrong Number");
        } else {
            System.out.println(number + " is not ArmStrong Number");
        }
    }


    public static int countDigit(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;

        }
        return count;
    }

    public static int digitsSum(int number) {

        int count=countDigit(number);
        int lastDigit,exponential,sum=0;
        while (number > 0) {
            lastDigit = number % 10;
            exponential = (int) Math.pow(lastDigit,count);
            sum += exponential;
            number /= 10;
        }
        return sum;
    }
}
