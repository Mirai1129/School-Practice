package tw.mirai1129.codejudger.tqc.lesson.lesson1;

import java.util.Scanner;

public class JP103 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0.0;
        try {
            radius = scanner.nextDouble();
        } catch (Exception e) {
            radius = 0.0;
        }

        double area = Math.PI * radius * radius;
        System.out.printf("%.4f", area);
    }
}
