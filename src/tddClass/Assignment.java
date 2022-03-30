package tddClass;
import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter number: ");
        int number = input.nextInt();
        for (int count = 1; count <= 12; count++) {
            int result = count * number;

            System.out.println(number + " X " + count + " = " + result);
        }


    }

}


