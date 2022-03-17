package chapter2;

import java.util.Scanner;

 public class
 IntMultiplication{

 public static void main (String [] args) {

 Scanner input = new Scanner(System.in);
 
 System.out.print(" Enter first interger: ");
 int number1 = input.nextInt();

 System.out.print("Enter second interger: ");
 int number2 = input.nextInt();

  System.out.print("Enter third interger: ");
  int number3 = input.nextInt();

 int product = number1 * number2 * number3 ;
 
 System.out.printf ("Product is %d%n " , product );


}
}