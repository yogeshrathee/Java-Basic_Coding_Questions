package org.example.JavaCourse.Challenge_12;

public class Patterns {
    public static void rightHalfPyramid(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }

    public static void reverseRightPyramid(int number){
        for(int i = number;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void leftHalfPyramid(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
