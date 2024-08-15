package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void Emp_List(){
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total employee::");
        int total=sc.nextInt();
        ArrayList<String> list=new ArrayList<>(total);

        System.out.println("enter the name of the "+total+" employees::");
        for(i=0;i< total;i++){
            System.out.print((i+1) + ". Name:: ");
            list.add(sc.next());
        }
        System.out.println("\n");
        System.out.println("<<=>>Entered the " + total + " employees\n\s\s\s\s\s Name of the employees are:->");
       for(i=0;i< total;i++){
           System.out.println("\s\s\s\s\s\s\s"+(i+1)+" :: " +list.get(i));

        }
    }
}
