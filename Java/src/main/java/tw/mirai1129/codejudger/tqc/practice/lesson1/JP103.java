package tw.mirai1129.codejudger.tqc.practice.lesson1;

import java.util.Scanner;

public class JP103 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        try {
            input = scanner.nextDouble();
        } catch (Exception e) {
            System.out.printf("%.4f", 0.0000);
            return;
        }
        double result = 0;
        result = Math.PI * Math.pow(input, 2);
        System.out.printf("%.4f", result);
    }
}
