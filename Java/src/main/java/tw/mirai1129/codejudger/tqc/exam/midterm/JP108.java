package tw.mirai1129.codejudger.tqc.exam.midterm;

import java.util.Scanner;

public class JP108 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            double number = sc.nextDouble();
            double result = f(number);
            System.out.printf("%.4f", result);

        } catch (Exception e) {
            System.out.print("error");
        }
    }

    public static double f(double num) {
        return 2 * Math.pow(num, 3) + 3 * num - 1;
    }
}
