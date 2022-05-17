package chapter5;

import java.util.Scanner;

public class StudentGrade {
    static Scanner input = new Scanner(System.in);
    private static int grade = input.nextInt();
    private static int aCount = 0;
    private static int bCount = 0;
    private static int cCount = 0;
    private static int dCount = 0;
    private static int fCount = 0;

    public static void main(String[] args) {
        takeInUserInput();
        printOutResults();
    }


    public static void takeInUserInput() {
        int gradeCounter = 0;

            System.out.println("Enter grade");
            int grade = input.nextInt();
            ++gradeCounter;

            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
            }
        }


    public static void printOutResults(){
        System.out.printf("%nGrade Report:%n");
        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                "Number of students who received each grade:",
                "A: ", aCount,
                "B: ", bCount,
                "C: ", cCount,
                "D: ", dCount,
                "F: ", fCount);
    }

}
