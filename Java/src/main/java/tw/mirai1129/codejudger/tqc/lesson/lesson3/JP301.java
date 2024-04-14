package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Scanner;

public class JP301 {
    static int sum = 0, average = 0, count = 0;

    public static void main(String[] args) {

        int[] n = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n.length; ++i) {
            n[i] = transferInvalidValue(sc.next());
        }

        compute(n);

        System.out.println(sum);
        System.out.println(average);
    }

    public static void compute(int[] n) {

        for (int i = 0; i < n.length; ++i) {
            if (n[i] > 50) {
                sum += n[i];
                count++;
            }
        }
        average = sum / count;
    }

    private static int transferInvalidValue(String input) {
        try {
            double number = Double.parseDouble(input); // 將字串轉換為浮點數
            return (int) Math.floor(number);
        } catch (NumberFormatException e) {
            return 0; // 若輸入文字，返回0
        }
    }
}
