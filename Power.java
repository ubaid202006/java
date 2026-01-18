// Question: 5
// Watts is the measure of power consumption of electrical appliances. Which can be calculated by using voltmeter and ammeter to read the voltage and ampere. Write a
// program that prints the Watts against the user given volt and ampere reading.

import java.util.Scanner;
public class Power{
    public static void main(String[]args){
       double volt;
       Scanner read= new Scanner(System.in);
       System.out.print("Enter the value of voltage:  ");
        volt=read.nextDouble();
        double amp;
        System.out.print("Enter the value of amphere:  ");
        amp=read.nextDouble();
        double pow;
        pow=amp*volt;
        System.out.print("The value of Power in watts = ");
        System.out.println(pow);  
        


    }
}
