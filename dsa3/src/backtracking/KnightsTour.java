package backtracking;

// Given a N by N chess board, find whether it is possible
// for the knight to visit all checks without moving to any check twice.
// Print the board in order of moves.

import java.util.Scanner;

public class KnightsTour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] chessBoard = new int[size][size];
        knightsOneTour(chessBoard, chessBoard.length - 1, 0, 1);
        printBoard(chessBoard);
    }

    // prints all possible configurations for N by N chess board
    public static void knightsTour(int[][] chessBoard, int row, int col, int moveNo) {

        if (moveNo == chessBoard.length * chessBoard.length && isValid(chessBoard, row, col)) {
            chessBoard[row][col] = moveNo;
            // print chess board
            printBoard(chessBoard);
            chessBoard[row][col] = 0; // backtracking for last move
            System.out.println();
            return;
        }

        if (isValid(chessBoard, row, col)) {
            chessBoard[row][col] = moveNo;

            // make recursive calls based on 8 ways the knight can move
            knightsTour(chessBoard, row - 2, col + 1, moveNo + 1);
            knightsTour(chessBoard, row - 1, col + 2, moveNo + 1);
            knightsTour(chessBoard, row + 1, col + 2, moveNo + 1);
            knightsTour(chessBoard, row + 2, col + 1, moveNo + 1);
            knightsTour(chessBoard, row + 2, col - 1, moveNo + 1);
            knightsTour(chessBoard, row + 1, col - 2, moveNo + 1);
            knightsTour(chessBoard, row - 1, col - 2, moveNo + 1);
            knightsTour(chessBoard, row - 2, col - 1, moveNo + 1);
            chessBoard[row][col] = 0; // backtracking
        }
    }

    // prints just one configuration
    public static boolean knightsOneTour(int[][] chessBoard, int row, int col, int moveNo) {

        if (moveNo == chessBoard.length * chessBoard.length && isValid(chessBoard, row, col)) {
            chessBoard[row][col] = moveNo;
            return true;
        }

        if (isValid(chessBoard, row, col)) {
            chessBoard[row][col] = moveNo;

            // make recursive calls based on 8 ways the knight can move
            if(knightsOneTour(chessBoard, row - 2, col + 1, moveNo + 1))
                return true;
            if(knightsOneTour(chessBoard, row - 1, col + 2, moveNo + 1))
                return true;
            if(knightsOneTour(chessBoard, row + 1, col + 2, moveNo + 1))
                return true;
            if(knightsOneTour(chessBoard, row + 2, col + 1, moveNo + 1))
                return true;
            if(knightsOneTour(chessBoard, row + 2, col - 1, moveNo + 1))
                return true;
            if(knightsOneTour(chessBoard, row + 1, col - 2, moveNo + 1))
                return true;
            if(knightsOneTour(chessBoard, row - 1, col - 2, moveNo + 1))
                return true;
            if(knightsOneTour(chessBoard, row - 2, col - 1, moveNo + 1))
                return true;
            chessBoard[row][col] = 0; // backtracking
        }
        return false;
    }

    private static boolean isValid(int[][] board, int row, int col) {
        if (row < 0 || row >= board.length || col < 0 || col >= board.length || board[row][col] > 0)
            return false;
        return true;
    }

    private static void printBoard(int[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
