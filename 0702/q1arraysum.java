import java.util.Scanner;

public class q1arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 讀取陣列長度
        int sum = 0;                // 用來儲存總和
        int ops = 0;                // 計算加總操作次數（Big-O 次數）

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();  // 讀取每個整數
            sum += value;              // 累加進 sum
            ops++;                     // 記錄一次操作
        }

        System.out.println(sum);   // 輸出總和
        System.out.println(ops);   // 輸出操作次數（O(n)）
    }
}
