package chapter5;

import java.util.Scanner;
import java.util.Arrays;

public class ExtremesTest {

    static int[] arrayOfNumbers;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;
    private static int counter;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        takeInArrayLength();
        collectElementsOfArray();
        checkForMinimumValue();
        checkForMaximumValue();
        printOutValues();
        }

        public static void takeInArrayLength(){

            System.out.println("Enter the number of elements you'd be using for this task: ");
            int userInput = input.nextInt();
            arrayOfNumbers = new int[userInput];
        }


        public static void collectElementsOfArray(){
            for (int i = 0; i < arrayOfNumbers.length; i++){
                System.out.println("Enter the elements of the array: ");
                arrayOfNumbers[i] = input.nextInt();
            }
        }

        public static void checkForMinimumValue() {
            for (counter = 0; counter < arrayOfNumbers.length; counter++) {
                min = Math.min(min, arrayOfNumbers[counter]);
            }
        }

        public static void checkForMaximumValue() {
            for (counter = 0; counter < arrayOfNumbers.length; counter++) {
                max = Math.max(max, arrayOfNumbers[counter]);
            }
        }


        public static void printOutValues(){
            System.out.println("The maximum value is : "+max+ "\nThe minimum value is: " +min);
        }
}
