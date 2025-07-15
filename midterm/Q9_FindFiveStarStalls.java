package midterm;

import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
        }
        sc.close();

        int count = 0;
        for (double s : scores) {
            if (s == 5.0) {
                count++;
            }
        }


        if (count == 0) {
            System.out.println("None");
            return;
        }


        int[] idx = new int[count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5.0) {
                idx[j++] = i;
            }
        }


        for (int i = 0; i < idx.length; i++) {
            System.out.print(idx[i]);
            if (i < idx.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
