// Question: 2
// Write a program that takes input of radius of circle and prints its circumference and area.


import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rad;
        double area;
        double cir;

        System.out.print("Enter Your Circle radius: ");
        rad = input.nextDouble();

        area = 3.14 * rad * rad;
        cir = 2 * 3.14 * rad;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + cir);

        input.close();
    }
}
