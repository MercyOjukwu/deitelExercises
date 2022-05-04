package chapter4;
import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        checkForLargestNumber();
    }

    public static double checkForLargestNumber() {

        Scanner in = new Scanner(System.in);
        double inNumber = 0;
        double largest = 0;
        int i = 0;
        System.out.println("Please enter a bunch of values. To end, enter a negative number.");

        while (inNumber >= 0) {
            inNumber = in.nextDouble();
        }
        if (inNumber > largest) {
            inNumber = largest;
        }
        System.out.println("The largest number is " +largest);

        return largest;

    }
}


