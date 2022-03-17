package chapter2;

import java.util.Scanner;

 public class IntComparison{

 public static void main (String [] args) {

 Scanner input = new Scanner (System.in);
 
 System.out.print(" Enter first interger: ");
 int number1 = input.nextInt();

 System.out.print("Enter second interger: ");
 int number2 = input.nextInt();

 if ( number1 != number2) {
System.out.printf("%d != %d%n" , number1, number2);
}
 



}
}