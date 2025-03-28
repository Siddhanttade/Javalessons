public class ProblemVII {
    //QUESTION1: N QUEENS PROBLEM IF WE ARE GIVEN A BOARD OF SIZE N AND N QUEENS THEN PLACE THEM IN PROPER MANNER SO THAT THEY CANT ATTACK
    //IT IS A RECURSIVE PROBLEM AS IT DEALS WITH CALLING FUNCTION FOR SHRINKING SIZE OF BOARD ALSO IT IS A BACKTRACKING PROB BECOZ WE NEED TO CHECK THE POSSIBILITIES
    public static void main(String[] args) {
        int n = 4;  // Example: N = 4
        boolean[][] board = new boolean[n][n];
        // int count = queens(board, 0);  // Start from row 0
        // System.out.println("Total solutions: " + count);  // Output total solutions found
        knights(board, 0, 0, 4);
    }

    // Recursive function to solve the N Queens problem
    public static int queens(boolean[][] board, int r) {
        if (r == board.length) {
            // All queens are placed successfully, display the board
            display(board);
            return 1;  // Found a valid solution
        }

        int count = 0;
        // Try to place a queen in every column of the current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, r, col)) {
                // Place the queen
                board[r][col] = true;
                // Recursively place queens in the next row
                count += queens(board, r + 1);
                // Backtrack: remove the queen
                board[r][col] = false;
            }
        }
        return count;
    }

    // Check if it's safe to place a queen at board[r][col]
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check the column for other queens
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check the left diagonal for other queens
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Check the right diagonal for other queens
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    // Display the board with 'Q' for queens and 'X' for empty spaces
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                if (cell) {
                    System.out.print("Q ");  // Queen is placed here
                } else {
                    System.out.print("X ");  // Empty space
                }
            }
            System.out.println();  // Move to the next row after printing each row
        }
        System.out.println();  // Add a blank line between solutions
    }

    //QUESTION2:N-KNIGHTS PROBLEM
    public static void knights(boolean[][] board,int row,int col,int kni){
        if(kni==0){
            displayKni(board);
            System.out.println();
            return;
        }

        if(row==board.length-1 && col==board.length){
            return;
        }

        if(col==board.length){
            knights(board, row+1, 0, kni);
            return;
        }

        if(isSafeKni(board, row, col)){
            board[row][col]=true;
            knights(board, row, col+1, kni-1);
            board[row][col]=false;
        }
        knights(board, row, col+1, kni);
    }
    
    //created to avoid repeatition in the isSafeKni function
    static boolean isValid(boolean[][] board,int row ,int col){
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    private static boolean isSafeKni(boolean[][] board,int row,int col){
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }

        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }

    private static void displayKni(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                if (cell) {
                    System.out.print("K ");  // Queen is placed here
                } else {
                    System.out.print("X ");  // Empty space
                }
            }
            System.out.println();  // Move to the next row after printing each row
        }
        System.out.println();  // Add a blank line between solutions
    }
}
