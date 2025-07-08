public class ArraySearcher {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        int target1 = 67;
        int target2 = 100;

        int index1 = findElement(array, target1);
        int count1 = countOccurrences(array, target1);

        int index2 = findElement(array, target2);
        int count2 = countOccurrences(array, target2);

        System.out.println("搜尋 67: 索引=" + index1 + ", 次數=" + count1);
        System.out.println("搜尋 100: 索引=" + index2 + ", 次數=" + count2);
    }
}
