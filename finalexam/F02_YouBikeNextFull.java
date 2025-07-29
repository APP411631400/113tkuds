package finalexam;

import java.util.*;


public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<String> rawTimes = new ArrayList<>();
        List<Integer> minuteTimes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String timeStr = sc.nextLine();
            rawTimes.add(timeStr);
            minuteTimes.add(toMinutes(timeStr));
        }

        String queryStr = sc.nextLine();
        int queryMin = toMinutes(queryStr);

        Map<Integer, String> timeMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            timeMap.put(minuteTimes.get(i), rawTimes.get(i));
        }

        Collections.sort(minuteTimes); 

        int ans = -1;
        int left = 0, right = minuteTimes.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (minuteTimes.get(mid) >= queryMin) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.println("No bike");
        } else {
            int foundMin = minuteTimes.get(ans);
            System.out.println(timeMap.get(foundMin));
        }

        sc.close();
    }

    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}

/*
 * Time Complexity: O(n log n)
 * 說明: 將 n 筆時間排序 O(n log n)，再用 binary search 找最早可搭班次 O(log n)
 */

