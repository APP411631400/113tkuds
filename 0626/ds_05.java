
public class ds_05 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 9, 1, 4, 6, 8, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("總和為：" + sum);
    }
}

