package chapter2;

import java.util.Scanner;

 public class NumberTest{
 
 public static void main(String [] args){
 
 Scanner input = new Scanner(System.in);

 System.out.println(" Enter first interger: ");
 int number1 = input.nextInt();

 System.out.println(" Enter second interger: ");
 int number2 = input.nextInt();

 System.out.println(" Enter third interger : ");
 int number3 = input.nextInt();
 
 if( number1 > number2 ){
 System.out.printf(" %d > %d%n", number1, number2);
}

 if ( number2 > number3){
 System.out.printf( " %d >%d%n" , number2, number3);
}



}


}