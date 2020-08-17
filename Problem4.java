// package Cipher_School.Java_Assignment2;

import java.util.Scanner;

class Circle{
    private double radius = 1.0;
    private String color = "red";
    Circle()
    {}
    Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
        {return radius;}
    public double getArea()
    {
        return 3.14*radius*radius;
    }
}
public class Problem4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();
        Circle c = new Circle(rad);
        System.out.println(String.format("%.4f", c.getRadius()));
        System.out.println(String.format("%.4f",c.getArea()));
        sc.close();
    }
}