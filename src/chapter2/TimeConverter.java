package chapter2;

import java.util.InputMismatchException;
import java.util.Scanner;

 public class TimeConverter{
 public static void main(String [] args) {

 Scanner input = new Scanner(System.in);

 try {
  System.out.println("Enter the number of minutes: ");
  double number1 = input.nextDouble();

  double arithmetic = number1 * 1.903 * 10 + 3;

  System.out.printf("Number of minutes in years is %.0f%n ", arithmetic);
 }
 catch(InputMismatchException exception){
  System.out.println("Program can only run with Integer input");
 }


}
}