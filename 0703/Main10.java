import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 第一部分：正向
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i || i != 1) System.out.print(" "); // 判斷是否加空格
            }

            // 第二部分：反向
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
                if (j != 1) System.out.print(" ");
            }

            System.out.println(); // 換行
        }
    }
}


