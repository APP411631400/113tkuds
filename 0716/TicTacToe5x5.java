import java.util.Scanner;

public class TicTacToe5x5 {
    private static final char EMPTY = '.';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static final int SIZE = 5;

    // 初始化 5x5 棋盤
    static char[][] initializeBoard() {
        char[][] board = new char[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = EMPTY;
            }
        }
        return board;
    }

    // 顯示棋盤
    static void printBoard(char[][] board) {
        System.out.println("\n  井字遊戲棋盤");
        System.out.print("  ");
        for (int col = 0; col < SIZE; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        for (int row = 0; row < SIZE; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    // 嘗試放置棋子
    static boolean placePiece(char[][] board, int row, int col, char player) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            System.out.println("❌ 無效座標，請重新輸入！");
            return false;
        }
        if (board[row][col] != EMPTY) {
            System.out.println("⚠️ 此位置已被佔用！");
            return false;
        }
        board[row][col] = player;
        return true;
    }

    // 檢查是否有五子連線（勝利）
    static char checkWinner(char[][] board) {
        // 檢查所有方向是否有連續 5 格相同玩家的棋子
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                char player = board[row][col];
                if (player == EMPTY) continue;

                // 向右
                if (col <= SIZE - 5 && allEqual(board, row, col, 0, 1, player)) return player;
                // 向下
                if (row <= SIZE - 5 && allEqual(board, row, col, 1, 0, player)) return player;
                // 斜右下
                if (row <= SIZE - 5 && col <= SIZE - 5 && allEqual(board, row, col, 1, 1, player)) return player;
                // 斜左下
                if (row <= SIZE - 5 && col >= 4 && allEqual(board, row, col, 1, -1, player)) return player;
            }
        }
        return EMPTY;
    }

    // 判斷從某點開始，指定方向是否有連續5個相同棋子
    static boolean allEqual(char[][] board, int row, int col, int dr, int dc, char player) {
        for (int i = 0; i < 5; i++) {
            if (board[row + i * dr][col + i * dc] != player) {
                return false;
            }
        }
        return true;
    }

    // 判斷棋盤是否已滿
    static boolean isBoardFull(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = initializeBoard();
        char currentPlayer = PLAYER_X;

        System.out.println("=== 🎮 5x5 井字遊戲開始 ===");
        printBoard(board);

        while (true) {
            System.out.printf("\n👤 玩家 %c 請輸入行與列 (0~%d)：", currentPlayer, SIZE - 1);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!placePiece(board, row, col, currentPlayer)) {
                continue; // 請重新輸入
            }

            printBoard(board);

            char winner = checkWinner(board);
            if (winner != EMPTY) {
                System.out.printf("\n🎉 玩家 %c 獲勝！\n", winner);
                break;
            }

            if (isBoardFull(board)) {
                System.out.println("\n🤝 平手！");
                break;
            }

            // 切換玩家
            currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
        }

        scanner.close();
        System.out.println("=== 遊戲結束 ===");
    }
}
