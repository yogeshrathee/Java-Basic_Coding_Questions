import java.util.*;
public class EvenOdd {
    public static void Even_odd(int[] arr) {
        int evenSum=0,oddSum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int b : arr){
            System.out.print(b+" ");

        }
        for (int j : arr) {
            if (j % 2 == 0) {
                evenSum += j;
            } else {
                oddSum += j;
            }
        }
        System.out.println();
        System.out.println("sum of Even number :: "+evenSum);
        System.out.println("sum of odd number :: "+oddSum);
    }
}
