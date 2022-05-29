//package ticTacToe;
//import  java.util.*;
//
//public class TicTacToe {
//    static String[] board;
//    static String turn;

//    public static void main(String[] args) {
//        printBoard();
//        collectInput();
//    }

//    public static void collectInput() {
//        Scanner in = new Scanner(System.in);
//        board = new String[9];
//        turn = "X";
//        String winner = null;
//
//
//        for (int count = 0; count < 9; count++) {
//            board[count] = String.valueOf(count + 1);
//        }
//
//        printBoard();
//
//        System.out.println("Welcome to Tic Tac Toe.");
//        System.out.println("Player one please enter a slot number to place X in:");
//
//        while (winner == null) {
//            int numInput = 0;
//            try {
//                numInput = in.nextInt();
//                if (!(numInput > 0 && numInput <= 9)) {
//                    System.out.println("Invalid input; please enter slot number again:");
//                    continue;
//                }
//            } catch (InputMismatchException e) {
//                System.out.println(
//                        "Invalid input; re-enter slot number:");
//            }
//
//            if (board[numInput - 1].equals(String.valueOf(numInput))) {
//                board[numInput - 1] = turn;
//                if (turn.equals("X")) {
//                    turn = "Player 2";
//                } else turn = "Player one";
//                printBoard();
//                winner = checkWinner();
//            } else {
//                System.out.println(
//                        "Slot already taken; re-enter slot number:");
//            }
//        }
//            if (winner.equalsIgnoreCase("draw")) {
//                System.out.println(
//                        "It's a draw! Thanks for playing.");
//            }
//            else {
//                System.out.println(
//                        "Congratulations! " + winner
//                                + "'s have won! Thanks for playing.");
//            }
//        }


//    public static String checkWinner(){
//        for(int counter = 0; counter < 8; counter++) {
//            String line = switch (counter) {
//                case 0 -> board[0] + board[1] + board[3];
//                case 1 -> board[3] + board[4] + board[5];
//                case 2 -> board[6] + board[7] + board[8];
//                case 3 -> board[0] + board[3] + board[6];
//                case 4 -> board[1] + board[4] + board[7];
//                case 5 -> board[2] + board[5] + board[8];
//                case 6 -> board[2] + board[4] + board[6];
//                case 7 -> board[0] + board[4] + board[8];
//                default -> null;
//            };
//
//            if (line.equals("XXX")) return "Player one is the winner!!!";
//            else if (line.equals("OOO")) return "Player two is the winner!!!";
//        }
//
//        for(int count = 0; count < 9; count++){
//            if(Arrays.asList(board).contains(String.valueOf(count + 1))) break;
//            else if (count == 8) return "No winner, it's a draw.";
//        }
//
//        System.out.println(turn+ "'s turn to play, enter a slot number to place;");
//        return null;
//         }

//       public  static void printBoard() {
//        System.out.println("|---|---|---|");
//        System.out.println("| " + board[0] + " | "
//                + board[1] + " | " + board[2]
//                + " |");
//        System.out.println("|-----------|");
//        System.out.println("| " + board[3] + " | "
//                + board[4] + " | " + board[5]
//                + " |");
//        System.out.println("|-----------|");
//        System.out.println("| " + board[6] + " | "
//                + board[7] + " | " + board[8]
//                + " |");
//        System.out.println("|---|---|---|");
//    }

//}

//    private int row;
//    private int column;
//
//    int[][] array = new int[3][3];
//    private final int currentPosition = array[row][column];
//
//    public void playGame(int spotOnBoard) {
//        this.row = row;
//        this.column = column;
//    }
//
//    public int currentPosition() {
//        return currentPosition;
//    }

