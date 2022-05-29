package ticTacToe;
import java.util.*;


public class MyTicTacToe {
    static String[] board;
    static String turn;


    public static void main(String[] args) {
        playGame();
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

        System.out.println(turn + " enter a slot number to place " + turn + " in:");
        return null;
    }


    static void printBoard() {
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
    }

    public static void playGame() {

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
                "Player one please enter a slot number to place X in: ");

        while (winner == null) {
            int numInput = 0;
            try {
                numInput = in.nextInt();

                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number: ");
                }
                 if(numInput != in.nextInt()){
                    System.out.println("Invalid input; re-enter slot number: ");
                }

            }catch (InputMismatchException e) {
                System.out.println("Invalid input; Please restart game :)");
                break;

            }catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Invalid input; re-enter slot number: ");
            }
             catch (NullPointerException exception) {
                System.out.println("hi hi :)");
            }

            try {
                if (board[numInput - 1].equals(
                        String.valueOf(numInput))) {
                    board[numInput - 1] = turn;

                    if (turn.equals("X")) turn = "Player two";
                    else turn = "Player one";

                    printBoard();
                    winner = checkWinner();
                } else System.out.println("Slot already taken; re-enter slot number:");
            }
            catch(ArrayIndexOutOfBoundsException exception){
                System.out.println();
            }
            catch (NullPointerException exception) {
                if (winner.equalsIgnoreCase("draw")) System.out.println("It's a draw! Play again :)");

                else System.out.println("Congratulations! " + winner + " Thanks for playing :)");
            }
        }


    }


}