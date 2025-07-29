package finalexam;

import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        List<String> stations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stations.add(sc.next());
        }

        String start = sc.next();
        String end = sc.next();

        int i1 = stations.indexOf(start);
        int i2 = stations.indexOf(end);

        if (i1 == -1 || i2 == -1) {
            System.out.println("Invalid");
        } else {
            int count = Math.abs(i1 - i2) + 1;
            System.out.println(count);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明: 使用 indexOf 搜尋 start 與 end 的位置各需 O(n)，總共 O(n)
 */

