package chapter4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int i; int fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
            System.out.println("The factorial of the number is : " +fact);

    }
}
