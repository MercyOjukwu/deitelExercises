package chapter2;

import java.util.Scanner;

 public class TimeConverter{
 public static void main(String [] args) {

 Scanner input = new Scanner(System.in);
 
 System.out.println("Enter the number of minutes: ");
 double number1 = input.nextDouble();
 
 double arithmetic = number1 * 1.903 * 10 + 3;
 
 System.out.printf ("Number of minutes in years is %.0d%n ", arithmetic);

 /* Double arithmetic1 = number1 / 1440;
 System.out.printf ("Number of minutes in days is %.0f%n ", arithmetic1); */



}
}