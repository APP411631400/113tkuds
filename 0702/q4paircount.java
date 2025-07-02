import java.util.Scanner;

public class q4paircount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // 讀取陣列長度
        int[] arr = new int[n];        // 宣告陣列

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();     // 讀入每個整數
        }

        int pairCount = 0;             // 組合次數 C(n,2)
        int ops = 0;                   // 操作次數（迴圈比較次數）

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // 每找到一組合法配對就算一次
                pairCount++;
                ops++;
            }
        }

        System.out.println(pairCount); // 輸出配對總數
        System.out.println(ops);       // 輸出操作次數
    }
}
