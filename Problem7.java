// package Cipher_School.Java_Assignment2;
import java.lang.Math;
import java.util.Scanner; 
class Triangle{
    double areaTriangle(int a,int b,int c)
    {
        float s = (a + b + c)/2;
        float squareArea = s*(s - a)*(s - b)*(s- c);
        return Math.sqrt(squareArea);
    }
}
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(t.areaTriangle(a,b,c));
        sc.close();
    }
    
}