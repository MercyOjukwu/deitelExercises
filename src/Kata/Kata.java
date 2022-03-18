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

    public int getResult() {
        return result2;
    }

    public boolean isEven(int number1) {

        if (number1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int isLargestNumber(int number, int number2, int number3, int number4, int number5) {

        // number = 1;  number2 = 2 ;  number3 = 3 ;  number4 = 4;  number5 = 5;


        if (number > number2 && number > number3 && number > number4 && number > number5) {
            return number;
        }

        if (number2 > number && number2 > number3 && number2 > number4 && number2 > number5) {
            return number2;
        }
        if (number3 > number && number3 > number2 && number3 > number4 && number3 > number5) {
            return number3;
        }

        if (number4 > number && number4 > number3 && number4 > number2 && number4 > number5) {
            return number4;
        }

        if (number5 > number && number5 > number2 && number5 > number3 && number5 > number4) {
            return number5;
        }

        return number;
    }


    public int noOfFactors(int digit) {
        int number, count = 0;
        for (number = 1; number <= digit; number++) {
            if (digit % number == 0)
                count++;
        }

        return count;

    }


    public boolean isPrime(int prime) {
        int number, count = 0;
        for (number = 1; number <= prime; number++) {
            if (prime % number == 0)
                count++;
            }
        if (count <= 2) {
            return true;
            } else {
                return false;
            }
    }




}




   /*  public boolean getResponse() {
        return response;
    } */





