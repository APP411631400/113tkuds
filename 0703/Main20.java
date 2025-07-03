import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 讀入一個整數 N
        int sum = 0;

        // 用 for 迴圈加總所有偶數
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum); // 輸出總和
    }
}
