package tw.mirai1129.codejudger.tqc.exam.midterm;

import java.util.Scanner;

public class JP209 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            double num1, num2;
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            String result1 = String.valueOf(num1);
            String result2 = String.valueOf(num2);

            if (num1 == (int) num1) {
                result1 = String.valueOf((int) num1);
            }
            if (num2 == (int) num2) {
                result2 = String.valueOf((int) num2);
            }

            if (num1 == 0 && num2 == 0) {
                System.out.println("(0,0) origin");
            } else if (num1 == 0) {
                System.out.printf("(%s,%s) Y", result1, result2);
            } else if (num2 == 0) {
                System.out.printf("(%s,%s) X", result1, result2);
            } else if (num1 > 0 && num2 > 0) {
                System.out.printf("(%s,%s) 1", result1, result2);
            } else if (num1 < 0 && num2 > 0) {
                System.out.printf("(%s,%s) 2", result1, result2);
            } else if (num1 < 0 && num2 < 0) {
                System.out.printf("(%s,%s) 3", result1, result2);
            } else if (num1 > 0 && num2 < 0) {
                System.out.printf("(%s,%s) 4", result1, result2);
            }

            // TO DO

        } catch (Exception e) {
            System.out.print("error");
            return;
        }
    }
}
