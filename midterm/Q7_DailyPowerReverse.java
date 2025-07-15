package midterm;

import java.util.Scanner;

public class Q7_DailyPowerReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] usage = new int[7];
        for (int i = 0; i < 7; i++) {
            usage[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 6; i >= 0; i--) {
            System.out.print(usage[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
