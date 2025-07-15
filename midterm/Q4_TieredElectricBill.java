package midterm;

import java.util.Scanner;

public class Q4_TieredElectricBill {
    private static double calc(int kWh) {
        double cost = 0.0;
        int remaining = kWh;

        if (remaining > 1000) {
            cost += (remaining - 1000) * 8.46;
            remaining = 1000;
        }
        if (remaining > 700) {
            cost += (remaining - 700) * 6.24;
            remaining = 700;
        }
        if (remaining > 500) {
            cost += (remaining - 500) * 5.04;
            remaining = 500;
        }
        if (remaining > 330) {
            cost += (remaining - 330) * 3.70;
            remaining = 330;
        }
        if (remaining > 120) {
            cost += (remaining - 120) * 2.45;
            remaining = 120;
        }
        cost += remaining * 1.68;

        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long total = 0;
        for (int i = 0; i < n; i++) {
            int kWh = sc.nextInt();
            double bill = calc(kWh);
            long roundedBill = Math.round(bill);
            System.out.println("Bill: $" + roundedBill);
            total += roundedBill;
        }
        sc.close();

        long avg = Math.round((double) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * 1. 每筆輸入呼叫 calc，calc 依最多 6 個 if 段計算 → O(1)
 * 2. 共處理 n 筆輸入 → O(n)
 * 整體為 O(n)
 */