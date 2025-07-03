import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 輸入最大值 N

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // 一旦發現能被整除，就不是質數，跳出
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

