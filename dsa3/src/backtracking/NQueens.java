package backtracking;

// Given a N by N chess board, place N Queens in such a way that
// no queen is attacking any other queen.

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        boolean[][] chessBoard = new boolean[N][N];
        placeNQueens(chessBoard,0);

        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static boolean placeNQueens(boolean[][] board, int rowNumber){
        // base condition
        if(rowNumber == board.length)
            return true;

        // create a loop to check for validity of queen in N cols in that row
        for(int col = 0; col<board.length;col++){

            if(isValid(board, rowNumber, col))
            {
                // it's a valid cell and queen can be placed here
                board[rowNumber][col] = true;
                if(placeNQueens(board,rowNumber+1))
                    return true;
                // backtracking
                board[rowNumber][col] = false;
            }
        }
       return false;
    }

    private static boolean isValid(boolean[][] board, int row, int col){
        // checking for valid cell on the chess board
        if(row<0 || row>=board.length || col<0 || col>=board.length)
            return false;
        // check for presence of queen in that col
        for(int x = 0; x <= row; x++){
            if(board[x][col] == true)
                return false;
        }
        // check for presence of queen in diagonal cells
        int i=1;

        while(i<=row){
            // check for left top diag
            if((col-i)>=0 && board[row-i][col-i]==true)
                return false;
            // check for right top diag
            if((col+i)<board.length && board[row-i][col+i] == true)
                return false;
            i++;
        }
        return true;
    }
}
