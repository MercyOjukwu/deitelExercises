package Kata;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionByZero {
    public static void main(String[] args) {
        divide(6,2);
//        boolean continueLoop = true;
//        do {
//            try {
//                int numerator = input("Enter a numerator");
//                int denominator = input("Enter a denominator");
//
//                int approximateQuotient = numerator / denominator;
//            } catch (ArithmeticException exception) {
//                display("Oops,you entered a wrong value...Bye bye");
//            }
//        }
//        while(true);
    }

    public static void divide(int numerator, int denominator){
        int quotient = 0;
        try{
            quotient =  numerator / denominator;
        }
        catch(Exception exception){
            System.out.println("Zero cannot be a denominator");
        }
        System.out.println("The result is: "+ quotient);
    }
    public static int input(String prompt){
        System.out.println(prompt);
        Scanner keyboardInput = new Scanner(System.in);
        int number = 0;
        try{
            return keyboardInput.nextInt();
        }

        catch(InputMismatchException mismatchException){

            display("I only accept integers");
            display("If e sure for u no enter integer");
            input(prompt);
        }
        return number;
    }



    public static void display(String prompt){
        System.out.println(prompt);
    }
}
