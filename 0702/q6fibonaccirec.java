import java.util.Scanner;

public class q6fibonaccirec {
    static int ops = 0; // 遞迴呼叫次數計數器

    // 遞迴計算 Fibonacci 數列 F(n)
    public static int fib(int n) {
        ops++; // 每次遞迴呼叫都加 1
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 讀入輸入 n（n ≤ 40）
        
        ops = 0;                // 初始化呼叫次數
        int result = fib(n);    // 計算 F(n)
        
        System.out.println(result); // 輸出 F(n)
        System.out.println(ops);    // 輸出總遞迴呼叫次數
    }
}
