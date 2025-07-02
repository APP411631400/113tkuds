import java.util.Scanner;

public class q2seqsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();           // 讀取陣列大小
        int[] arr = new int[n];         // 建立陣列
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();      // 讀入每個元素
        }

        int key = sc.nextInt();         // 讀取要搜尋的 key
        int ops = 0;                    // 比較次數
        boolean found = false;          // 是否找到

        for (int i = 0; i < n; i++) {
            ops++;                      // 每次比較就加 1 次操作
            if (arr[i] == key) {
                found = true;
                break;                  // 找到就提早結束
            }
        }

        System.out.println(found ? "Yes" : "No"); // 輸出是否找到
        System.out.println(ops);                  // 輸出操作次數
    }
}
