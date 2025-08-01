package midterm;

import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(sc.nextLine().trim());
        }
        sc.close();


        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }

            double tmp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = tmp;
        }

        int limit = Math.min(n, 5);
        for (int i = 0; i < limit; i++) {
            System.out.printf("%.1f%n", scores[i]);
        }
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：
 * 1. 讀入並存放 n 筆評分 → O(n)
 * 2. 兩層迴圈選擇排序 → O(n^2)
 * 整體以選擇排序為主，為 O(n^2)
 */
