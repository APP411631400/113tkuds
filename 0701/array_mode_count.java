

public class array_mode_count {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 1, 1, 1};

        int mode = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println("比對中：" + arr[i] + " 出現次數 = " + count);

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("眾數為：" + mode + "，出現 " + maxCount + " 次");
    }
    // 時間複雜度:
    // 使用了兩層迴圈（巢狀）來進行次數比對：
    // 外層跑 n 次，內層對每個元素再跑 n 次
    // 所以總共會進行 n × n = n² 次比較
    // 時間複雜度為：O(n²)


    // 此作法的時間複雜度為 O(n²)，是否可改善？
    // 可以！若使用 HashMap 來儲存每個數字的出現次數，只需一次掃描陣列，時間複雜度可改善為：O(n)
}
