// Question: 8
// Find Area of Triangle?

import java.util.Scanner;
public class Triangle{
    public static void main(String[]args){
       double a;
       Scanner read= new Scanner(System.in);
       System.out.print("Enter length of first side :  ");
        a=read.nextDouble();
        double b;
        System.out.print("Enter length of second side:  ");
        b=read.nextDouble();
        double c;
        System.out.print("Enter length of third side:  ");
        c=read.nextDouble();
        double S;
        S=(a+b+c)/2;
        double Area;
        Area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.print("Area of triangle = ");
        System.out.println(Area);
    }
}
