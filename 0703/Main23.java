import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();           // 讀入陣列長度
        int[] arr = new int[n];         // 建立陣列

        // 讀取陣列元素
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 初始最大最小值
        int max = arr[0];
        int min = arr[0];

        // 掃描陣列找最大與最小值
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 輸出結果：最大值與最小值，中間用空格隔開
        System.out.println(max + " " + min);
    }
}

