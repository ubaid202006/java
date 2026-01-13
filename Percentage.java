// Question: 1
// Write a program that prints the percentage marks of high school graduates by taking input of sum of their obtained marks and Maximum marks.

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double obt, max, per;

        System.out.print("Please enter total marks: ");
        max = input.nextDouble();

        while (max <= 0)
        {
            System.out.print("Please enter positive total marks: ");
            max = input.nextDouble();
        }

        System.out.print("Please enter your obtained marks: ");
        obt = input.nextDouble();

        while (obt < 0 || obt > max)
        {
            System.out.print("Please enter valid obtained marks (positive and less than total marks): ");
            obt = input.nextDouble();
        }

        per = obt / max * 100;
        System.out.print("Your percentage is: " + per + "%");
        input.close();
    }
}

