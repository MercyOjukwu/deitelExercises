package chapter4;
import java.util.Scanner;

public class SalesManCommission {
    private static double totalPay;

    public static void main(String[] args) {
     displayQuestions();

    }

    public static void displayQuestions(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = input.nextLine();
        System.out.println("How many items did you sell? ");
        int noOfItemsSold = input.nextInt();
        System.out.println("How much does each item cost? ");
        double priceOfItems = input.nextDouble();
        totalPay =  SalesCommission.calculateProfit(priceOfItems, noOfItemsSold);

        System.out.println(userName+ ",your total pay for the week is " +totalPay);
    }






}
