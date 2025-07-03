import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀入 N 與 M
        int N = sc.nextInt(); // 行數
        int M = sc.nextInt(); // 列數

        // 建立原始矩陣
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 輸出轉置矩陣（M行N列）
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(matrix[i][j]);
                if (i < N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

