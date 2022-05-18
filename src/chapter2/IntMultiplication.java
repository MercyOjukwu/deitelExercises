package chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

 public class
 IntMultiplication{

 public static void main (String [] args) {

 Scanner input = new Scanner(System.in);

 try {
  System.out.print(" Enter first integer: ");
  int number1 = input.nextInt();

  System.out.print("Enter second integer: ");
  int number2 = input.nextInt();

  System.out.print("Enter third integer: ");
  int number3 = input.nextInt();

  int product = number1 * number2 * number3;

  System.out.printf("Product is %d%n ", product);
 }
 catch(InputMismatchException exception){
  System.out.println("Program can only run with integer input");
 }

}
}