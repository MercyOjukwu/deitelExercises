package chapter4;

import java.util.Scanner;

public class NewComparator {
    Scanner input = new Scanner(System.in);
    private int firstInput;
    private int secondInput;

    public static void compareNumbers(){

//        if(number1 == number2){
//            System.out.println(0);
//        }
//        else if(number1 > number2){
//            System.out.println(1);
//        }
//        else System.out.println(-1);
    }

    public void collectInput(int number1, int number2) {
        firstInput = number1;
        secondInput = number2;
    }

    public int getUserInput() {
        return firstInput + secondInput;
    }
}
