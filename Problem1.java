import java.util.*;
interface Calculator{
   int absFunc(int a,int b);
}

public class Lambda1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculator add = (int x,int y) ->(x+y);
        System.out.println("Addition: "+add.absFunc(a, b));

        Calculator difference = (int x,int y) ->(x-y);
        System.out.println("Difference: "+difference.absFunc(a, b));

        Calculator product = (int x,int y) ->(x*y);
        System.out.println("Product: "+product.absFunc(a, b));

        Calculator safedevide = (int x,int y) ->(x+y);
        System.out.println("Division: "+safedevide.absFunc(a, b));

        sc.close();
    }
}
