package chapter4;

import java.util.Scanner;

public class NewComparator {
    public static void main(String[] args) {
        compareNumbers();
    }
    public static void compareNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = input.nextInt();
        System.out.println("Enter another number: ");
        int number2 = input.nextInt();

        if(number1 == number2){
            System.out.println(0);
        }
        else if(number1 > number2){
            System.out.println(1);
        }
        else System.out.println(-1);
    }
}
