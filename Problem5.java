import java.util.Scanner;

// package Cipher_School.Java_Assignment2;

class Complex{
    double real,img;
    Complex(double real,double img)
    {
        this.real = real;
        this.img = img;
    }
    public static Complex sum(Complex x,Complex y)
    {
        Complex temp = new Complex(0,0);
        temp.real = x.real + y.real;
        temp.img = x.img + y.img;
        return temp;
    }
    public static Complex product(Complex x,Complex y)
    {
        Complex temp = new Complex(0,0);
        temp.real = (x.real*b.real) - (x.img*y.img);
        temp.img = x.img*b.real + x.real*y.img;
        return temp;
    }
    public static Complex diff(Complex x,Complex y)
    {
        Complex temp = new Complex(0,0);
        temp.real = x.real - y.real;
        temp.img = x.img - y.img;
        return temp;
    }   
    
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Complex number 1: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Complex c1 = new Complex(a,b);

        System.out.println("Complex number 2: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Complex c2 = new Complex(x,y);

        System.out.println("1st Number: "+ a+"+"+"i"+b);
        System.out.println("2nd Number: "+ x+"+"+"i"+y);

        Complex sum = Complex.sum(c1, c2);
        Complex diff = Complex.diff(c1, c2);
        Complex product = Complex.product(c1, c2);

        System.out.println("Sum of two numbers is: " + sum.real +"+"+"("+sum.img+")"+"i");
        System.out.println("Difference of two numbers is: " + diff.real +"+"+"("+diff.img+")"+"i");
        System.out.println("Product of two numbers is:" + product.real +"+"+"("+product.img+")"+"i");

        sc.close();
    }
    
}