package org.example.JavaCourse.Challenge_9.SumOfEvenOddNumber;

public class EvenOdd {
    public static void evenOdd(int startNumber, int endNumber){
        int evenSum=0,oddSum=0;
        for(int i=startNumber;i<endNumber;i++){
            if(i % 2 == 0){
                evenSum+=i;
            }
            else {
                oddSum+=i;
            }
        }
        System.out.println("Sum of even number between "+startNumber+" to "+endNumber+" is "+evenSum);
        System.out.println("Sum of Odd number between "+startNumber+" to "+endNumber+" is "+oddSum);
    }
}
