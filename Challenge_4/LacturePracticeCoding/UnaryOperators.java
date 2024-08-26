package org.example.JavaCourse.Challenge_4.LacturePracticeCoding;

import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();

        int negativeValue = -input;
        System.out.println(negativeValue); // -5

        System.out.println(negativeValue++); // -5  (-5 + 1 = -4)

        System.out.println(++negativeValue); // -4 +1 = -3

        System.out.println(negativeValue--); // -3 (-3 -1 = -4)
        System.out.println(--negativeValue); // -4 -1 = -5

    }
}
