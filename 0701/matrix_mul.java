

public class matrix_mul {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    System.out.println("a[" + i + "][" + k + "] * b[" + k + "][" + j + "] = " 
                        + a[i][k] + " * " + b[k][j] + " = " + (a[i][k] * b[k][j]));
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.println("c[" + i + "][" + j + "] = " + c[i][j]);
                System.out.println();
            }
        }
    }
}
