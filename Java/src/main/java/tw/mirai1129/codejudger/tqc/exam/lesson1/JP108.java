package tw.mirai1129.codejudger.tqc.exam.lesson1;

import java.util.Scanner;

public class JP108 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double result = f(a);
            System.out.printf("%.4f", result);


        } catch (Exception e) {
            System.out.print("error");
        }
    }

    public static double f(double num) {
        return (2 * Math.pow(num, 3)) + (num * 3) - 1;
    }
}
