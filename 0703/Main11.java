import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][][] cube = new int[N][N][N]; // 宣告3維陣列
        int count = 1;

        // ⚠️正確的填法：x 為列，y 為行，z 為層
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                for (int z = 0; z < N; z++) {
                    cube[x][y][z] = count++;
                }
            }
        }

        // ⚠️輸出時以 z 為最外層（層），每層要輸出 y 行、x 列
        for (int z = 0; z < N; z++) {
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < N; x++) {
                    System.out.print(cube[x][y][z]);
                    if (x < N - 1) System.out.print(" ");
                }
                System.out.println();
            }
            if (z < N - 1) System.out.println(); // 層與層之間空行
        }
    }
}


