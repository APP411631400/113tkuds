package midterm;

import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();

        int[] ps = new int[n + 1];
        ps[0] = 0;
        for (int i = 1; i <= n; i++) {
            ps[i] = ps[i - 1] + a[i - 1];
        }

        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + ps[i]);
        }
        System.out.println();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. 讀取並存入 n 筆比賽結果 → O(n)
 * 2. 計算 prefix sums → O(n)
 * 3. 輸出 k 筆結果 → O(k) ⊆ O(n)
 * 整體為 O(n)
 */
