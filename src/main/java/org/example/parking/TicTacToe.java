package org.example.parking;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        int moves = 0;

        while (!gameWon && moves < 9) {
            System.out.println("Player " + currentPlayer + ", enter row (0-2) and column (0-2) separated by space: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                printBoard();
                gameWon = checkWin(row, col);
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                moves++;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        if (gameWon) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw! The game is over.");
        }

        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private static boolean checkWin(int row, int col) {
        return checkRow(row) || checkColumn(col) || checkDiagonals(row, col);
    }

    private static boolean checkRow(int row) {
        return board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer;
    }

    private static boolean checkColumn(int col) {
        return board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer;
    }

    private static boolean checkDiagonals(int row, int col) {
        return (row == col && board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
                || (row + col == 2 && board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }
}
