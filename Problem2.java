package Cipher_School.Java_Assignment2;
import java.util.*;
class Rectangle{
    void display(int height, int width)
    {
        System.out.println(height + " " +width);
    }
}
class RectangleArea extends Rectangle{
    int height,width;
    void getInput(int x,int y)
    {
        height= x;
        width = y;
    }
    void display()
    {
        System.out.println(height*width);
    }
}
public class Problem2 {
    public static void main(String[] args) {
    RectangleArea r = new RectangleArea();
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();
    int width = sc.nextInt();
    r.getInput(height, width);
    System.out.println("Height and Width are: ");
    r.display(height,width);
    System.out.println("Area: ");
    r.display();
    sc.close();
    }

    
}