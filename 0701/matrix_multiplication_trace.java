

public class matrix_multiplication_trace {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] c = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                System.out.print("計算位置 c[" + i + "][" + j + "]：");
                for (int k = 0; k < 2; k++) {
                    System.out.print(a[i][k] + "*" + b[k][j]);
                    c[i][j] += a[i][k] * b[k][j];
                    if (k < 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println(" = " + c[i][j]);
            }
        }

        System.out.println("\n結果矩陣：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 時間複雜度說明:
    // 矩陣乘法使用三層巢狀迴圈（i, j, k）來計算每個位置的內積，因此整體執行次數與矩陣大小 n 的立方成正比。時間複雜度為：O(n³)
}
