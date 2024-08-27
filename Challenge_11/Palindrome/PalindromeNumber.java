package org.example.JavaCourse.Challenge_11.Palindrome;

public class PalindromeNumber {
    public static void palindromeNumber(int number){
        if(reverseNumber(number) == number){
            System.out.println(number+" is palindrome");
        }else{
            System.out.println(number+" is not palindrome");
        }

    }

    public static int reverseNumber(int number){
        int lastDigit,reverse=0;
        while(number>0){
            lastDigit = number % 10;
            reverse = reverse*10+lastDigit;
            number /=10;
        }
        return reverse;
    }
}
