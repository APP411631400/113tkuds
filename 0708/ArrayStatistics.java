public class ArrayStatistics {
    public static void main(String[] args) {
        int[] array = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        int sum = 0;
        int max = array[0], min = array[0];
        int maxIndex = 0, minIndex = 0;
        int countAboveAvg = 0;
        int evenCount = 0, oddCount = 0;

        for (int num : array) {
            sum += num;
        }

        double avg = (double) sum / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > avg) {
                countAboveAvg++;
            }
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("========== 陣列統計分析結果 ==========");
        System.out.println("總和: " + sum);
        System.out.printf("平均值: %.1f\n", avg);
        System.out.println("最大值: " + max + "（索引: " + maxIndex + "）");
        System.out.println("最小值: " + min + "（索引: " + minIndex + "）");
        System.out.println("大於平均值的數量: " + countAboveAvg);
        System.out.println("偶數個數: " + evenCount);
        System.out.println("奇數個數: " + oddCount);
        System.out.println("======================================");
    }
}
