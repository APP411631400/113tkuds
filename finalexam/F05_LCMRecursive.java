package finalexam;

import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a, b);
        long lcm = (long) a / g * b;
        System.out.println("LCM: " + lcm);
        sc.close();
    }

    private static int gcd(int x, int y) {
        if (x == y) return x;
        return x > y ? gcd(x - y, y) : gcd(x, y - x);
    }
}
/*
 * Time Complexity: O(max(a, b))
 * 說明: 使用輾轉相減法遞迴求 GCD，最壞情況兩數相差 1 時需遞迴 O(max(a,b)) 次
 */

