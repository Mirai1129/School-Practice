package tw.mirai1129.codejudger.tqc.lesson.lesson2;

import java.util.Scanner;

public class JP208 {

    public static void main(String args[]) {

        try {
            Scanner sc = new Scanner(System.in);
            int level = sc.nextInt();
            if (1 <= level && level <= 9) {
                for (int i = 1; i <= level; ++i) {
                    for (int j = i; j >= 1; --j) {
                        System.out.printf("%d*%d=%-4s", i, j, String.format("%02d", i * j));
                    }
                    System.out.println();
                }
            } else {
                System.out.println("error");
                return;
            }
        } catch (Exception e) {
            System.out.print("error");
            return;
        }
    }
}
