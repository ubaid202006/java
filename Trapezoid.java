// Question: 6
// A quadrilateral with at least one pair of parallel sides is called a trapezoid or trapezium. The area K of a trapezoid is given by K = h * (a + b)/2, 
// where a and b are the lengths of the parallel sides, his the height (the perpendicular distance between these sides). Write a program that takes input lengths
// of two parallel sides and the perpendicular distance between these two parallel lines, and prints the area of this trapezoid.


import java.util.Scanner;
public class Trapezoid{
    public static void main(String[]args){
       double a;
       Scanner read= new Scanner(System.in);
       System.out.print("Enter length of first parallel side: ");
        a=read.nextDouble();
        double b;
        System.out.print("Enter length of second parallel side: ");
        b=read.nextDouble();
        double c; 
        System.out.print("Enter perpendicular distance: ");
        c=read.nextDouble();
        
        double Area;
        Area=(a+b)*c/2;
        System.out.print("Area of trapezoid = ");
        System.out.println(Area);  
        


    }
}
