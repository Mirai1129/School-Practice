package tw.mirai1129.tqctest;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            // 輸入x、y座標
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            // 檢查座標位置
            if (x == 0 && y == 0) {
                System.out.printf("(%.0f,%.0f) origin", x, y);
            } else if (x == 0) {
                System.out.printf("(%.0f,%.0f) Y", x, y);
            } else if (y == 0) {
                System.out.printf("(%.0f,%.0f) X", x, y);
            } else if (x > 0 && y > 0) {
                System.out.printf("(%.0f,%.0f) 1", x, y);
            } else if (x < 0 && y > 0) {
                System.out.printf("(%.0f,%.0f) 2", x, y);
            } else if (x < 0 && y < 0) {
                System.out.printf("(%.0f,%.0f) 3", x, y);
            } else if (x > 0 && y < 0) {
                System.out.printf("(%.0f,%.0f) 4", x, y);
            }

        } catch (Exception e) {
            System.out.print("error");
        }
    }
}
