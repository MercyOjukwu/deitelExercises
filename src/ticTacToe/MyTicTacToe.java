package ticTacToe;
import java.util.*;

public class MyTicTacToe {

    static String[] board;
    static String turn;

    public static void main(String[] args) {
        startGame();
    }
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = switch (a) {
                case 0 -> board[0] + board[1] + board[2];
                case 1 -> board[3] + board[4] + board[5];
                case 2 -> board[6] + board[7] + board[8];
                case 3 -> board[0] + board[3] + board[6];
                case 4 -> board[1] + board[4] + board[7];
                case 5 -> board[2] + board[5] + board[8];
                case 6 -> board[0] + board[4] + board[8];
                case 7 -> board[2] + board[4] + board[6];
                default -> null;
            };

            if (line.equals("XXX")) {
                return "Player one is the winner!!!";
            } else if (line.equals("OOO")) {
                return "Player two is the winner!!!";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) break;
            else if (a == 8) return "draw";

        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }



    static void printBoard() {
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
    }

    public static void startGame() {

        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("*******************************");
        System.out.println("Welcome to my Tic-Tac-Toe :)");
        System.out.println("*******************************");
        System.out.println();
        printBoard();

        System.out.println(
                "Player one please enter a slot number to place X in:");

        while (winner == null) {
            int numInput = 0;
            try {
                numInput = in.nextInt();

                if (!(numInput > 0 && numInput <= 9))  {System.out.println("Invalid input; re-enter slot number:");
                    continue;}

            } catch (InputMismatchException e) {

                System.out.println("Invalid input; please restart game :)");
                break;
            }
            catch(ArrayIndexOutOfBoundsException exception){
                System.out.println("Invalid input; please enter slot number again:");
            }
            try {
                if (board[numInput - 1].equals(
                        String.valueOf(numInput))) {
                    board[numInput - 1] = turn;

                    if (turn.equals("X")) turn = "O";
                    else turn = "X";

                    printBoard();
                    winner = checkWinner();
                } else System.out.println("Slot already taken; re-enter slot number:");
            }
            catch(ArrayIndexOutOfBoundsException exception){
                System.out.println();
            }
        }


        if (winner != null) {
            if (winner.equalsIgnoreCase("draw")) System.out.println("It's a draw! Play again :)");

            else System.out.println("Congratulations! " + winner + " Thanks for playing :)");
        }

    }


}


