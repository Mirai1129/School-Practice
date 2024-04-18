package tw.mirai1129.codejudger.tqc.practice.lesson1;

import java.util.Scanner;

public class JP104 {

    public static void main(String[] args) {

        try {
            double x1, x2, y1, y2;
            Scanner sc = new Scanner(System.in);
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            double result = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            System.out.printf("%.4f", result);
        } catch (Exception e) {
            System.out.print("error");
            System.exit(0);
        }
    }
}
