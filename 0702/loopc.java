

public class loopc {
    public static void main(String[] args) {
        int x = 0;           // 初始 x 為 0
        int count = 0;       // 紀錄執行 x = x + 1 的次數

        do {
            x = x + 1;       // 每次執行：x 加 1
            count++;         // 每執行一次就 count+1
        } while (x++ <= 100); // 先判斷 x，再執行 x++

        // 印出總共執行了幾次
        System.out.println(count);
    }
}
