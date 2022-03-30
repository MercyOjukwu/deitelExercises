package chapter4;
import java.util.Scanner;
import java.util.Random;


public class RandomMathQuiz {

    static Random randomNumber = new Random();
   public static int firstNumber = 1 + randomNumber.nextInt(10);
   public static int secondNumber = 1 + randomNumber.nextInt(10);

   public static int correctAnswer = 0;
   public static int wrongAnswer = 0;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        

            int result = 0;


                char operator = '+';
                switch (randomNumber.nextInt(5)) {
                    case 1 -> { operator = '+'; result = firstNumber + secondNumber;}
                    case 2 -> { operator = '-'; result = firstNumber - secondNumber;}
                    case 3 -> { operator = 'X'; result = firstNumber * secondNumber;}
                    case 4 -> { operator = '/'; result = firstNumber / secondNumber;}

                }
                System.out.print(firstNumber + " " + operator + " " + secondNumber + " = ");
                System.out.println();
                int userInput = input.nextInt();



                    if (userInput == result) {
                        correctAnswer++;

                    }
                    else wrongAnswer++;


                    System.out.println("Total number of correct answers is " +correctAnswer);
                    System.out.println("Total number of correct answers is " +wrongAnswer);
                    System.out.println("Adjusted score is " +correctAnswer+ - +wrongAnswer);



    }
}
