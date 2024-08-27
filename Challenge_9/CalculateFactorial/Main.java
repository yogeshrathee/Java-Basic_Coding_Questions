package org.example.JavaCourse.Challenge_9.CalculateFactorial;

import org.example.JavaCourse.Challenge_9.MultiplicationTable.MultiTable;

public class Main {
    public static void main(String[] args) {
        int value= MultiTable.inputReader();

        System.out.println(Factorial.calFact(value));
    }
}
