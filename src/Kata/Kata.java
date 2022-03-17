package Kata;
import java.util.Scanner;

public class Kata {

    private boolean result;

    public Object getResult1() {
        return result;
    }

    Scanner input = new Scanner(System.in);

    public void numberTester(int palindrome) {


        result = true;


    }


    private int total;

    public void utmePricing(int noOfCopies) {
        int amount;


        if (noOfCopies <= 4) {
            amount = noOfCopies * 2000;
        }
        if (noOfCopies >= 5) {
            amount = noOfCopies * 1800;
        }
        if (noOfCopies >= 10) {
            amount = noOfCopies * 1600;
        }
        if (noOfCopies >= 30) {
            amount = noOfCopies * 1500;
        }
        if (noOfCopies >= 50) {
            amount = noOfCopies * 1300;
        }
        if (noOfCopies >= 100) {
            amount = noOfCopies * 1200;
        }
        if (noOfCopies >= 200) {
            amount = noOfCopies * 1100;
        }
        if (noOfCopies >= 500) {
            amount = noOfCopies * 1000;
        }


    }


    public int getTotal() {
        return total;
    }

    private int result2;

    public void numberDivision(int number1, int number2) {

        int division = number1 / number2;
        result2 = division;


    }
        public int getResult() {return result2;}

}
