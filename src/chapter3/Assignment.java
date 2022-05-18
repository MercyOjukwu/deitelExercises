package chapter3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment {
    static Scanner input = new Scanner(System.in);
    private static int number;
    public static void main(String[] args) {

           collectUserInput();
           runMultiplicationTable();

    }
    public  static void collectUserInput(){
        try{
            System.out.println("Enter an integer value: ");
            number = input.nextInt();
        }
        catch(InputMismatchException exception){
            System.out.println("Program can only run with integer input"); }
            System.exit(0);
    }

    public static void runMultiplicationTable(){
        for (int count = 1; count <= 12; count++) {
             int result = count * number;

             System.out.println(number + " X " + count + " = " + result);
        }
    }
}


