package chapter4;
//import java.util.*;

public class Triangle {
    public static void main(String[] args) {
    }


    private static void printFirstTriangle() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows you want to print out: \n");
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }

    private static void printSecondTriangle() {
        int rows = 0;
        for (int i = 6; i >= rows; i--) {
            for (int y = 6; y >= i; y--) {
                System.out.print("* ");
            }
            System.out.println("");

        }

    }

}
