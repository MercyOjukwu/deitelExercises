package chapter2;
import java.util.Scanner;
 
 public class Addition{
 
 static Scanner input = new Scanner(System.in);

 public static void main(String [] args) {
 
 System.out.print("Enter first interger: ");

 int number1 = input.nextInt();

 System.out.print("Enter second interger: ");

 int number2 = input.nextInt();

 int sum = number1 + number2;

 System.out.printf(" Sum is %d%n" ,sum);
}



}