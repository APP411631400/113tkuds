import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 輸入整數 N

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                continue; // 偶數就跳過，不累加
            }
            sum += i; // 奇數加總
        }

        System.out.println(sum);
    }
}

