package chapter4;

import java.util.Scanner;

public class Taxify {

    public static void main(String[] args) {
        displayQuestions();

    }

    public static void displayQuestions(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = input.nextLine();
        System.out.println("How much do you earn annually? ");
        int yearlyEarning = input.nextInt();
        System.out.println("What percentage of tax are you due for? ");
        int taxPercent = input.nextInt();
        double taxAmount =  CitizenTax.calculateTaxAmount(taxPercent, yearlyEarning);

        System.out.println(userName+ ",your tax amount is " +taxAmount);
    }
}
