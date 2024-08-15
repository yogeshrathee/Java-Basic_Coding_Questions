package org.example;
import java.util.List;

public class Student {
    public String name;
    public int roll_no;
    public   int age;

    public Student(String name, int roll_no, int age) {
        this.name=name;
        this.roll_no=roll_no;
        this.age=age;
    }

    public static void studentExample(List<Student> data){
       for(int i=0;i<data.size()-1;i++){
           for(int j=0;j< data.size()-i-1;j++){
               if(data.get(j).roll_no>data.get(j+1).roll_no){
                   Student temp=data.get(j);
               data.set(j,data.get(j+1));
               data.set(j+1, temp);
               }
           }
       }
    }
}
