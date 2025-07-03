import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        int num = 1;
        int top = 0, bottom = N - 1;
        int left = 0, right = N - 1;

        while (num <= N * N) {
            // ➤ 往右
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // ➤ 往下
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // ➤ 往左
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // ➤ 往上
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        // ➤ 印出結果
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]);
                if (j < N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

