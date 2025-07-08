public class StudentGradeSystem {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        char[] grades = new char[scores.length];
        int[] gradeCounts = new int[4];
        int maxIndex = 0, minIndex = 0;
        int sum = 0;
        int countAboveAverage = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;

            if (score >= 90) {
                grades[i] = 'A';
                gradeCounts[0]++;
            } else if (score >= 80) {
                grades[i] = 'B';
                gradeCounts[1]++;
            } else if (score >= 70) {
                grades[i] = 'C';
                gradeCounts[2]++;
            } else {
                grades[i] = 'D';
                gradeCounts[3]++;
            }

            if (score > scores[maxIndex]) {
                maxIndex = i;
            }
            if (score < scores[minIndex]) {
                minIndex = i;
            }
        }

        double average = (double) sum / scores.length;

        for (int score : scores) {
            if (score > average) {
                countAboveAverage++;
            }
        }

        System.out.println("======== 成績統計報告 ========");
        System.out.println("最高分學生位置: " + maxIndex + "，分數: " + scores[maxIndex]);
        System.out.println("最低分學生位置: " + minIndex + "，分數: " + scores[minIndex]);
        System.out.printf("平均分數: %.1f\n", average);
        System.out.printf("高於平均的學生比例: %.1f%%\n", (double) countAboveAverage / scores.length * 100);
        System.out.println("----------------------------");
        System.out.println("等級統計：");
        System.out.println("A 等人數: " + gradeCounts[0]);
        System.out.println("B 等人數: " + gradeCounts[1]);
        System.out.println("C 等人數: " + gradeCounts[2]);
        System.out.println("D 等人數: " + gradeCounts[3]);
        System.out.println("----------------------------");
        System.out.println("詳細列表：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("學生 " + i + "：分數 = " + scores[i] + "，等級 = " + grades[i]);
        }
        System.out.println("==============================");
    }
}
