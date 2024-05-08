package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class JP303 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {
                numbers[i] = sc.nextInt();
            } catch (Exception e) {
                numbers[i] = 0;
                sc.next();
            }
        }
        sc.close();
        compute(numbers);
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void compute(int[] numbers) {
        Arrays.sort(numbers);
    }
}
