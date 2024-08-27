package org.example.JavaCourse.Challenge_9.LeastCommonMultipleAndGreatestCommonDivisor;

import org.example.JavaCourse.Challenge_9.MultiplicationTable.MultiTable;

public class Main {
    public static void main(String[] args) {
        int firstValue= MultiTable.inputReader();
        int secondValue=MultiTable.inputReader();

        System.out.println("LCM:: "+FindLCM.findLCM(firstValue,secondValue));
        System.out.println("GCD:: "+FindGCD.findGCD(firstValue,secondValue));



    }
}
