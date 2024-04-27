package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Scanner;

public class JP305 {

    public static void main(String[] args) {

        long[] n = new long[50];
        n[0] = 0;
        n[1] = 1;
        for (int i = 2; i < n.length; i++) {
            n[i] = n[i - 1] + n[i - 2];
        }

        try {
            Scanner sc = new Scanner(System.in);
            int searchIndex = sc.nextInt();
            System.out.println((searchIndex + 1) + ":" + n[searchIndex]);

        } catch (Exception e) {
            System.out.print("error");
            return;
        }
    }
}
