import java.util.Scanner;

public class q7permutation {
    static int ops = 0; // 計算排列總數（操作次數）

    // 遞迴實作排列
    public static void permute(int[] arr, int start, int n) {
        if (start == n) {
            // 印出一個排列
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            ops++; // 計數一次
        } else {
            for (int i = start; i < n; i++) {
                swap(arr, start, i);
                permute(arr, start + 1, n); // 遞迴排列剩下部分
                swap(arr, start, i);        // 還原原狀（backtrack）
            }
        }
    }

    // 交換陣列中兩個元素
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 輸入 n
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;         // 初始化為 1~n
        }

        permute(arr, 0, n);         // 開始全排列
        System.out.println(ops);    // 輸出總排列數
    }
}
