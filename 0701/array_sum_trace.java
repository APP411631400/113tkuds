

public class array_sum_trace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("加總過程：total = " + total + " + " + arr[i] + " = " + (total + arr[i]));
            total += arr[i];
        }

        System.out.println("總和為：" + total);
    }
    //說明此演算法的時間複雜度:
    //這個加總演算法使用了一個長度為 n 的陣列，
    //透過一個迴圈逐一加總每個元素。每次迴圈執行的操作數量是固定的
    //，因此整體的執行次數與陣列長度成正比。因此，時間複雜度為：O(n)
}

