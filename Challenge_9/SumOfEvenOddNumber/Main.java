package org.example.JavaCourse.Challenge_9.SumOfEvenOddNumber;

import org.example.JavaCourse.Challenge_9.MultiplicationTable.MultiTable;

public class Main {
    public static void main(String[] args) {
        int startValue= MultiTable.inputReader();
        int endValue= MultiTable.inputReader();

        EvenOdd.evenOdd(startValue,endValue);
    }
}
