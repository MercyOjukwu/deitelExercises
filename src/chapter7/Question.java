package chapter7;
import java.util.Scanner;

public class Question {

    private static int option1;
    private static int firstResponse;

    private static int option2;

    public static void main(String[] args) {

        String[] e_versus_iQuestions = {
                "A. expend energy, enjoy groups. "," B. conserve energy, enjoy one-on-one",
                "A. more outgoing, think out loud.", "B more reserved, think to yourself",
                "A. seek many tasks, public activities, interaction with others." ," B. seek private, solitary activities with quiet to concentrate",
                "A.external, communicative, express yourself. " , " B. internal, reticent, keep to yourself",
                "A. active, initiate. " ," B. reflective, deliberate"};

        Scanner input = new Scanner(System.in);

        for ( int  options= 0; options <= 10; options++) {
            switch (options) {
                case 1 -> {
                    System.out.print(e_versus_iQuestions[0]);
                    System.out.print(" OR ");
                    System.out.println(e_versus_iQuestions[1]);
                    firstResponse = input.nextInt();
                }
                case 2 -> {
                    System.out.print(e_versus_iQuestions[2]);
                    System.out.print(" ");
                    System.out.println(e_versus_iQuestions[3]);
                    firstResponse = input.nextInt();
                }
                case 3 -> {
                    System.out.print(e_versus_iQuestions[4]);
                    System.out.print(" ");
                    System.out.println(e_versus_iQuestions[5]);
                    firstResponse = input.nextInt();
                }
                case 4 -> {
                    System.out.print(e_versus_iQuestions[6]);
                    System.out.print(" ");
                    System.out.println(e_versus_iQuestions[7]);
                    firstResponse = input.nextInt();
                }
                case 5 -> {
                    System.out.print(e_versus_iQuestions[8]);
                    System.out.print(" ");
                    System.out.println(e_versus_iQuestions[9]);
                    firstResponse = input.nextInt();
                }
            }

            if(firstResponse == 1){
                option1++;
            }
            else option2++;

        }
    }
}