package finalexam;

import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        double totalTax = 0.0;
        for (int i = 0; i < n; i++) {
            double income = Double.parseDouble(sc.nextLine());
            double tax = calculateTax(income);
            System.out.printf("Tax: %.2f%n", tax);
            totalTax += tax;
        }

        double average = totalTax / n;
        System.out.printf("Average: %.2f%n", average);
        sc.close();
    }

    private static double calculateTax(double income) {
        double tax = 0.0;
        double[] limits = {540000, 1210000, 2420000, 4530000};
        double[] rates  = {0.05, 0.12, 0.20, 0.30, 0.40};

        double prev = 0.0;
        double remaining = income;
        for (int i = 0; i < limits.length; i++) {
            double bracket = Math.min(remaining, limits[i] - prev);
            if (bracket > 0) {
                tax += bracket * rates[i];
                remaining -= bracket;
                prev = limits[i];
            }
        }
        if (remaining > 0) {
            tax += remaining * rates[rates.length - 1];
        }
        return tax;
    }
}
/*
 * Time Complexity: O(n)
 * 說明: 每筆收入只要依階梯稅率走訪一次，計算稅額為 O(1)，共 n 筆為 O(n)
 */

