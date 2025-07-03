import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble(); // 輸入半徑
        double area = 3.14 * radius * radius; // 面積公式 πr²

        // 格式化輸出到小數點後兩位
        System.out.printf("%.2f\n", area);
    }
}

