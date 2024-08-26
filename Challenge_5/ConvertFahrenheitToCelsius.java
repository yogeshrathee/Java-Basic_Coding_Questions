package org.example.JavaCourse.Challenge_5;

import java.util.Scanner;

public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit-32)*((double) 5/9);

        System.out.println(celsius);
    }
}
