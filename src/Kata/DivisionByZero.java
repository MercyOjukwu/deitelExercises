package Kata;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionByZero {
    public static void main(String[] args) {
        int numerator = input("Enter a numerator");
        int denominator = input("Enter a denominator");
        int approximateQuotient = numerator / denominator;
        display(approximateQuotient+ "");
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
            System.exit(3);
        }
        return number;
    }



    public static void display(String prompt){
        System.out.println(prompt);
    }
}
