package org.example.JavaCourse.Challenge_10.ReverseDigitsOfANumber;

public class ReverseDigits {
    public static int reverseDigit(int number){


            /*
Example:
Suppose we want to reverse the number 1234.

Initial State:

number = 1234
reverse = 0
First Iteration:

Extract the last digit: lastDigit = number % 10 = 1234 % 10 = 4
Update the reversed number: reverse = reverse * 10 + lastDigit = 0 * 10 + 4 = 4
Remove the last digit from number: number = number / 10 = 1234 / 10 = 123
At the end of the first iteration:

reverse = 4
number = 123
Second Iteration:

Extract the last digit: lastDigit = number % 10 = 123 % 10 = 3
Update the reversed number: reverse = reverse * 10 + lastDigit = 4 * 10 + 3 = 40 + 3 = 43
Remove the last digit from number: number = number / 10 = 123 / 10 = 12
At the end of the second iteration:

reverse = 43
number = 12
Third Iteration:

Extract the last digit: lastDigit = number % 10 = 12 % 10 = 2
Update the reversed number: reverse = reverse * 10 + lastDigit = 43 * 10 + 2 = 430 + 2 = 432
Remove the last digit from number: number = number / 10 = 12 / 10 = 1
At the end of the third iteration:

reverse = 432
number = 1
Fourth Iteration:

Extract the last digit: lastDigit = number % 10 = 1 % 10 = 1
Update the reversed number: reverse = reverse * 10 + lastDigit = 432 * 10 + 1 = 4320 + 1 = 4321
Remove the last digit from number: number = number / 10 = 1 / 10 = 0
At the end of the fourth iteration:

reverse = 4321
number = 0
Termination:

The loop terminates because number = 0.
Final Output:
The reversed number is 4321.
*/
        int reverse=0,lastDigit;
        while(number>0){
            lastDigit= number%10;
            reverse =reverse*10 + lastDigit;
            number /=10;

        }
        return reverse;

    }
}
