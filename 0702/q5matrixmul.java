import java.util.Scanner;

public class q5matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();                    // 讀取矩陣大小 n

        int[][] A = new int[n][n];               // 建立矩陣 A
        int[][] B = new int[n][n];               // 建立矩陣 B
        int[][] C = new int[n][n];               // 儲存結果矩陣 C

        // 讀入矩陣 A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 讀入矩陣 B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int ops = 0; // 操作次數（乘法與加法）

        // 矩陣相乘 C = A × B
        for (int i = 0; i < n; i++) {           // 第 i 列
            for (int j = 0; j < n; j++) {       // 第 j 行
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j]; // A 的橫列 × B 的直行
                    ops++; // 每次乘法加法視為一個操作
                }
            }
        }

        // 輸出結果矩陣 C
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j]);
                if (j != n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        // 輸出操作次數
        System.out.println(ops);
    }
}
