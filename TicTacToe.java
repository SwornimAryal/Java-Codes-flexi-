import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static char[] board = {
            '1','2','3',
            '4','5','6',
            '7','8','9'
    };
    static char currentPlayer = 'X';
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gameRunning = true;
        while (gameRunning) {
            printBoard();
            try {
                System.out.print("Player " + currentPlayer + ", enter slot (1-9): ");
                int choice = sc.nextInt();
                if (choice < 1 || choice > 9) {
                    throw new IllegalArgumentException("Invalid slot number.");
                }
                if (board[choice - 1] == 'X' || board[choice - 1] == 'O') {
                    throw new Exception("Slot already occupied.");
                }
                board[choice - 1] = currentPlayer;
                if (checkWin()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (checkDraw()) {
                    printBoard();
                    System.out.println("Game is a draw.");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            }catch (InputMismatchException e) {
                System.out.println("Error: Enter only numbers.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    static boolean checkWin() {
        int[][] winPatterns = {
                {0,1,2},{3,4,5},{6,7,8},
                {0,3,6},{1,4,7},{2,5,8},
                {0,4,8},{2,4,6}
        };
        for (int[] p : winPatterns) {
            if (board[p[0]] == currentPlayer &&
                board[p[1]] == currentPlayer &&
                board[p[2]] == currentPlayer)
                return true;
        }
        return false;
    }

    static boolean checkDraw() {
        for (char c : board) {
            if (c != 'X' && c != 'O')
                return false;
        }
        return true;
    }
}

    