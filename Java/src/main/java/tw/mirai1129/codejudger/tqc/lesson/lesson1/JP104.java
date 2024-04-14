package tw.mirai1129.codejudger.tqc.lesson.lesson1;

import java.util.Scanner;

public class JP104 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double x1 = 0, x2 = 0, y1 = 0, y2 = 0;
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            sc.nextLine();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();

            double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            System.out.printf("%.4f", distance);
        } catch (Exception e) {
            System.out.print("error");
            System.exit(0);
        }
    }
}
