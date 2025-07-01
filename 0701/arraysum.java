
public class arraysum {

    // 定義一個靜態方法，接收整數陣列與陣列長度，回傳總和
    public static int sum(int[] arr, int n) {
        int total = 0; // 初始化總和為 0

        // 迴圈從 0 加總到 n-1
        for (int i = 0; i < n; i++) {
            total += arr[i]; // 每次加上陣列中第 i 個元素
        }

        return total; // 回傳總和
    }

    public static void main(String[] args) {
        // 建立一個測試陣列
        int[] testArray = {1, 2, 3, 4, 5};

        // 呼叫 sum 函式，並印出結果
        int result = sum(testArray, testArray.length);

        System.out.println("總和為: " + result);
    }
}
