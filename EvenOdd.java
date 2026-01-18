// Question: 7
// Write a Program that Claculate Even and Odd number?

import java.util.Scanner;
public class EvenOdd{
    public static void main(String[]args){
       int num;
       Scanner read= new Scanner(System.in);
       System.out.print("Enter any number:  ");
        num=read.nextInt();
        if(num%2==0)
            System.out.print("Even ");
        else
            System.out.print("Odd ");

    }
}
