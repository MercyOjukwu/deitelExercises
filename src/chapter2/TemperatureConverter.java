package chapter2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter{
 public static void main (String [] args) {

  try {
   Scanner input = new Scanner(System.in);
   float Fahrenheit;

   System.out.println("Enter temperature in Celsius");
   float celsius = input.nextInt();
   Fahrenheit = ((celsius * 9) / 5) + 32;
   System.out.println("Temperature in Fahrenheit is:" + Fahrenheit);

  }
    catch(InputMismatchException exception){
     System.out.println("Program can only run with digit input");
    }
 }


}