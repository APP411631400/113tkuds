

public class countloops {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("第 " + i + " 次迴圈");
            sum += i;     // 加總（可選）
            count++;      // 計次
        }

        System.out.println("總共執行了 " + count + " 次");
        System.out.println("sum = " + sum);  // 如果你想知道加總結果
    }
}
