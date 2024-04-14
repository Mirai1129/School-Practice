package tw.mirai1129.class0321;

import java.awt.*;
import java.util.Scanner;

public class Gobang {
    static Scanner scanner = new Scanner(System.in);
    static Toolkit tool = Toolkit.getDefaultToolkit();

    static int[][] gobang = new int[25][25];

    static int who = 1;

    public static void main(String[] args) {
        int i, j, k;
        int row, col;
        while (true) {
            System.out.println("\t\t\t兩人五子棋 遊戲:");
            System.out.println("  |");
            for (i = 0; i <= 24; i++) {
                System.out.printf("%-2d", i++);
            }
            System.out.println();
            System.out.println("--|-");
            for (i = 0; i <= 24; i++) {
                System.out.println("--");
            }
            System.out.println();

            k = 0;
            for (i = 0; i <= 24; i++) {
                System.out.printf("%-2d|", k++);
                for (j = 0; j <= 24; j++) {
                    if (gobang[i][j] == 0) {
                        System.out.println("口口");
                    } else if (gobang[i][j] == 1) {
                        System.out.println("甲");
                    } else {
                        System.out.println("乙");
                    }
                    System.out.println();
                }
            }
            if (who % 2 == 1) {
                System.out.println("甲");
            } else {
                System.out.println("乙");
            }
        }
    }
}
