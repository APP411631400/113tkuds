import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀入一個整數 N (0 <= N <= 12)

        int result = 1; // 儲存階乘結果
        int i = 1;

        while (i <= n) {
            result *= i; // result = result * i
            i++;         // 累加 i
        }

        System.out.println(result); // 輸出階乘
    }
}

