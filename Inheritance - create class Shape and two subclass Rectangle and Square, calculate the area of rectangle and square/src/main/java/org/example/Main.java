package org.example;


public class Main{
    public static void main(String[] args) {

    Rectangle rectangle=new Rectangle(3.0,10.0);
        System.out.println("Area of Rectangle:: "+rectangle.getArea());

        Square square=new Square(4.0);
        System.out.println("Area of Square:: "+square.getArea());
    }
}
