package org.example.Array1D2D3D;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value = sc.nextInt();

        // 1D array
        //int[] arr = {1,2,3};

        int[] arr= new int[value];

        for(int i=0;i<value;i++) {
                arr[i]= sc.nextInt();
        }
                System.out.println(Arrays.toString(arr));


        // 2D array
        // int[][] arr1={{1,2,2},{3,4,5},{4,5,6}};

        int[][] arr1=new int[value][value];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[value-1].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int[] num : arr1){
            System.out.println(Arrays.toString(num));
        }


        // 3D Array
//        int[][][] arr2 = {
//                {
//                        {1,2,3},
//                        {2,3,4},
//                        {3,4,5}
//                },
//                {
//                        {6,7,8},
//                        {9,10,11},
//                        {12,13,14}
//
//                },
//                {
//                        {14,15,16},
//                        {17,18,19},
//                        {20,21,22}
//                }
//        };

        int[][][] arr2 = new int[value][value][value];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[value-1].length;j++){
                for(int k = 0;k<arr2[value-1][value-1].length;k++){
                    arr2[i][j][k]=sc.nextInt();
                }
            }
        }
        for(int[][] num2 : arr2){
            for(int[] num3 : num2){
                System.out.println(Arrays.toString(num3));
            }
        }
    }
}