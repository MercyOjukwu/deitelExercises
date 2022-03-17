package chapter2;

import java.util.Scanner;

  public class CompoundInterest{
  public static void main (String [] args){ 

  Scanner input = new Scanner(System.in);
 
  System.out.println(" Enter savings amount: " );
  double amount = input.nextDouble();

  double arithmetic = amount * 6 * (1 + 0.00417);

  System.out.printf( " %s%n%f ", " The savings amount after the sixth month at  savings rate of 0.00417 per month is : " , arithmetic);

  


}
}