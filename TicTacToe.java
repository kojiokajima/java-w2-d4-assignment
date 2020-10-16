// Inae, Marina.Y, and Koji

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        String[][] board = new String[7][7];

        // assign the initial value for array
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < ７; j++) {
                if (i % 2 == 0) {
                    board[i][j] = "-";
                } else {
                    if (j % 2 == 0) {
                        board[i][j] = "|";
                    } else {
                        board[i][j] = " ";
                    }
                }
            }
        }

        String player = "O";

        while (!isWinning(player, board)) {

            if (player == "X") {
                player = "O";
            } else {
                player = "X";
            }

            printBoard(board);
            playGame(player, board);

        }
        
        printBoard(board);
        System.out.println(player + " player won");
        
    }

    // prints the board
    public static void printBoard(String arrayBoard[][]) {
        for (int k = 0; k < 7; k++) {
            for (int l = 0; l < 7; l++) {
                System.out.print(arrayBoard[k][l]);
            }
            System.out.println("");
        }
    }
    
    // playing section
    public static void playGame(String currentPlayer, String playerBoard[][]) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a row(0, 1, or 2) for player " + currentPlayer + ": ");
        int row = input.nextInt() * 2 + 1;
        System.out.print("Enter a column(0, 1, or 2) for player " + currentPlayer + ": ");
        int column = input.nextInt() * 2 + 1;
        
        playerBoard[row][column] = currentPlayer;
        
    }
    
    // check if there is a winner
    public static boolean isWinning(String player, String winnerBoard[][]) {
        if (
            (winnerBoard[1][1] == winnerBoard[1][3] && winnerBoard[1][3] == winnerBoard[1][5]) && ((winnerBoard[1][1] == "O") || (winnerBoard[1][1] == "X")) ||
            (winnerBoard[3][1] == winnerBoard[3][3] && winnerBoard[3][3] == winnerBoard[3][5]) && ((winnerBoard[3][1] == "O") || (winnerBoard[3][1] == "X")) ||
            (winnerBoard[5][1] == winnerBoard[5][3] && winnerBoard[5][3] == winnerBoard[5][5]) && ((winnerBoard[5][1] == "O") || (winnerBoard[5][1] == "X")) ||
            (winnerBoard[1][1] == winnerBoard[3][1] && winnerBoard[3][1] == winnerBoard[5][1]) && ((winnerBoard[1][1] == "O") || (winnerBoard[1][1] == "X")) ||
            (winnerBoard[1][3] == winnerBoard[3][3] && winnerBoard[3][3] == winnerBoard[5][3]) && ((winnerBoard[1][3] == "O") || (winnerBoard[1][3] == "X")) ||
            (winnerBoard[1][5] == winnerBoard[3][5] && winnerBoard[3][5] == winnerBoard[5][5]) && ((winnerBoard[1][5] == "O") || (winnerBoard[1][5] == "X")) ||
            (winnerBoard[1][1] == winnerBoard[3][3] && winnerBoard[3][3] == winnerBoard[5][5]) && ((winnerBoard[1][1] == "O") || (winnerBoard[1][1] == "X")) ||
            (winnerBoard[3][1] == winnerBoard[3][3] && winnerBoard[3][3] == winnerBoard[1][5]) && ((winnerBoard[3][1] == "O") || (winnerBoard[3][1] == "X"))
        ) {
            return true;
        }
        return false;
    }
}