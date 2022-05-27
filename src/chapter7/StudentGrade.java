package chapter7;
import java.util.Scanner;

public class StudentGrade {

        public static void main(String[] args) {
            initialMessage();
            collectUserInputAndDisplayTable();

        }


        public static void initialMessage() {
            System.out.println("==============================");
            System.out.println("Student's Grade book");
            System.out.println("==============================");
        }

        public static void collectUserInputAndDisplayTable() {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter number of Students: ");
            int students = keyboard.nextInt();

            System.out.print("Enter number of Subjects: ");
            int subjects = keyboard.nextInt();

            int[][] array = new int[students][subjects];
            int[][] total = new int[students][subjects];
            double[][] average = new double[students][subjects];
            System.out.println("============================================");

            for (int i = 0; i < students; i++) {
                for (int j = 0; j < subjects; j++) {
                    System.out.print("Enter student " + (i + 1) + " score for subject " + (j + 1) + ": ");
                    int studentScore = keyboard.nextInt();
                    array[i][j] = studentScore;
                }
            }
            for (int i = 0; i < students; i++) {
                int sum = 0;
                for (int j = 0; j < subjects; j++) {
                    sum += array[i][j];
                    total[i][0] = sum;
                    average[i][0] = (sum * 1.0) / subjects;

                }
            }
            System.out.println("==================================================================");

            System.out.printf("%s", "STUDENTS");


            for (int i = 0; i < subjects; i++) {
                System.out.print("      SUB" + (i + 1) );
            }
            System.out.printf("%9s%9s", "TOT", "AVG");
            System.out.println();


            for (int i = 0; i < students; i++) {
                System.out.print("Student" + (i + 1) + "      ");
                for (int j = 0; j < subjects; j++) {
                    System.out.print(array[i][j] + "        ");
                }
                //System.out.println();


                for (int j = 0; j < 1; j++) {
                    System.out.print(total[i][j] + "     ");

                }

                for (int j = 0; j < 1; j++) {
                    System.out.printf("%.2f    ", average[i][j]);

                }
                System.out.println();
            }
            System.out.println("==================================================================");

        }
    }

