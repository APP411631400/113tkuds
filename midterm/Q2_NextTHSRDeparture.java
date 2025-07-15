package midterm;

import java.util.Scanner;
import java.util.Arrays;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            String[] hm = sc.nextLine().split(":");
            times[i] = Integer.parseInt(hm[0]) * 60 + Integer.parseInt(hm[1]);
        }
        String[] q = sc.nextLine().split(":");
        sc.close();
        int query = Integer.parseInt(q[0]) * 60 + Integer.parseInt(q[1]);
        
        int pos = Arrays.binarySearch(times, query);
        int idx;
        if (pos >= 0) {
            idx = pos + 1;
        } else {
            idx = -pos - 1;
        }
        
        if (idx >= n) {
            System.out.println("No train");
        } else {
            int h = times[idx] / 60;
            int m = times[idx] % 60;
            System.out.printf("%02d:%02d\n", h, m);
        }
    }
}

/*
 * Time Complexity: O(n + log n) = O(n)
 * 說明:
 * 1. 讀取並轉換 n 筆時間 → O(n)
 * 2. Arrays.binarySearch → O(log n)
 */
