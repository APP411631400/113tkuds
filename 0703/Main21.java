import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 讀入一個整數 N

        // 外層迴圈：列（i 為乘數）
        for (int i = 1; i <= n; i++) {
            // 內層迴圈：欄（j 為被乘數）
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j); // 每個數字佔 4 格
            }
            System.out.println(); // 換行
        }
    }
}

