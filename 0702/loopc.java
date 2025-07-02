

public class loopc {
    public static void main(String[] args) {
        int x = -100;
        int count = 0; // 計算 x = x + 1 被執行的次數

        do {
            x = x + 1;
            count++;
        } while (x++ <= 100); // 強制執行 101 次

        System.out.println(count);
    }
}
