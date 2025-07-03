import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 讀進來的是整行字串 "12+26"
        
        String[] parts = input.split("\\+"); // 用 "+" 切割字串成 ["12", "26"]
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        System.out.println(a + b); // 輸出加總
    }
}

