package chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

 public class NumberTest{
 
 public static void main(String [] args){

  try {
   Scanner input = new Scanner(System.in);

   System.out.println(" Enter first integer: ");
   int number1 = input.nextInt();

   System.out.println(" Enter second integer: ");
   int number2 = input.nextInt();

   System.out.println(" Enter third integer : ");
   int number3 = input.nextInt();

   if (number1 > number2) {
    System.out.printf(" %d > %d%n", number1, number2);
   }

   if (number2 > number3) {
    System.out.printf(" %d >%d%n", number2, number3);
   }

  }
  catch(InputMismatchException exception){
   System.out.println("Program can only run with integer input");
  }

}


}