package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.Student.studentExample;

public class Main {
    public static void main(String[] args) {
        int[] arr={10,5,3,8,11};
        sortExample.sort(arr);
        for(int arr1 : arr) {
            System.out.print(arr1 +" ");
        }
        System.out.println("\n");
            List<Student> student=new ArrayList<>();
            student.add(new Student("yogesh",12,24));
            student.add(new Student("Sachin",11,25));
            student.add(new Student("Annu",13,22));
            studentExample(student);
            for(Student student1 : student){
                System.out.println("Roll_No:: "+student1.roll_no+", name:: "+student1.name+" "+", Age:: "+student1.age+" ");
            }

        }
    }