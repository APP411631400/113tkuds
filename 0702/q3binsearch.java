import java.util.Scanner;

public class q3binsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();         // 讀取陣列大小
        int[] arr = new int[n];       // 建立陣列

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    // 輸入排序好的陣列元素
        }

        int key = sc.nextInt();       // 輸入要搜尋的目標 key
        int ops = 0;                  // 操作次數
        int left = 0, right = n - 1;
        int index = -1;               // 預設沒找到為 -1

        while (left <= right) {
            ops++;                    // 每次比較就算一次操作
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                index = mid;          // 找到目標
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;       // 往右邊找
            } else {
                right = mid - 1;      // 往左邊找
            }
        }

        System.out.println(index);    // 輸出 index 或 -1
        System.out.println(ops);      // 輸出比較次數
    }
}
