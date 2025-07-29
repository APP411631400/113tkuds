package finalexam;

import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            if (v > max) {
                secondMax = max;
                max = v;
            } else if (v > secondMax && v < max) {
                secondMax = v;
            }
        }
        System.out.println("SecondMax: " + secondMax);
        sc.close();
    }
}
/*
 * Time Complexity: O(n)
 * 說明: 單次掃描更新 max 與 secondMax
 */

