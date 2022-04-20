package chapter8;

import java.util.Arrays;

public class SevenSegmentsDisplay {


    static int[][] board = new int[5][4];

    public static void main(String[] args) {
        setValue("11110111");
        display();
    }

    public static void display() {
        for (var i : board) {
            for (var j : i) {
                if (j == 1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void setValue(String valueToPrintOut) {

        if (valueToPrintOut.length() > 8) {
            valueToPrintOut = valueToPrintOut.substring(0, 8);
        }


        char[] chars = valueToPrintOut.toCharArray();
        for (char i : chars) {
            if (!(i == '1' || i == '0')) {
                throw new IllegalArgumentException("the input must be 0's and 1's only");
            }
        }

        for (int i = 0; i < valueToPrintOut.length(); i++) {
            if (valueToPrintOut.charAt(i) == '1') {
                switch (i) {
                    case 0 -> printA();
                    case 1 -> printB();
                    case 2 -> printC();
                    case 3 -> printD();
                    case 4 -> printE();
                    case 5 -> printF();
                    case 6 -> printG();


                }
            }
        }
    }

    private static void printA() {
        Arrays.fill(board[0], 1);
    }

    private static void printB() {
        for (int i = 0; i < board[0].length  - 1; i++) {
            board[i][3] = 1;
        }
    }

    private static void printC() {
        for (int i = 2; i <= board[0].length ; i++) {
            board[i][3] = 1;
        }
    }

    private static void printD() {
        for (int i = 0; i < board[0].length; i++) {
            board[4][i] = 1;
        }
    }

    private static void printE() {
        for (int i = 2; i <= board[0].length ; i++) {
            board[i][0] = 1;
        }
    }

    private static void printF() {
        for (int i = 0; i < board[0].length - 1; i++) {
            board[i][0] = 1;
        }
    }

    private static void printG() {
        for (int i = 0; i < board[0].length; i++) {
            board[2][i] = 1;
        }
    }
}
