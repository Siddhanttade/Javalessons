import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board=new char[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }         
        }
            char player='X';
            boolean gameOver = false;
            Scanner sc = new Scanner(System.in);

            while (!gameOver) {
            printBoard(board);
            System.out.println("player " + player + ", enter your move (row and column): ");
            int row= sc.nextInt();
            int col= sc.nextInt();
            if(board[row][col] == ' ') {
                //place ele
                board[row][col] = player;
                gameOver=haveWon(board, player);
                if (gameOver) {
                    printBoard(board);
                    System.out.println("Player " + player + " has won!");
                } else {
                    if(player == 'X') {
                        player = 'O'; // switch to player O
                    } else {
                        player = 'X'; // switch to player X
                    }
                } 
            }else {
                System.out.println("This cell is already occupied. Try again.");
            }
        }
        printBoard(board);
    }

    public static boolean haveWon(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }        
            System.out.println(); 
        }
    }
}