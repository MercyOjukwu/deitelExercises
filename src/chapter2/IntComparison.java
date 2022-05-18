package chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

 public class IntComparison{

 public static void main (String [] args) {

 Scanner input = new Scanner (System.in);

 try{
 System.out.print(" Enter first integer: ");
 int number1 = input.nextInt();

 System.out.print("Enter second integer: ");
 int number2 = input.nextInt();

 if ( number1 != number2) {
System.out.printf("%d != %d%n" , number1, number2);
    }
 }
 catch(InputMismatchException exception){
  System.out.println("Program can only run with integer input");
  System.exit(0);
  }
 



 }
}