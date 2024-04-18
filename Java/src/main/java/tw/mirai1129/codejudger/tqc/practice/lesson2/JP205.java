package tw.mirai1129.codejudger.tqc.practice.lesson2;

import java.util.Scanner;

public class JP205 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            if (num1 < 0 || num2 < 0) {
                System.out.println("error");
                return;
            }
        } catch (Exception e) {
            System.out.print("error");
            return;
        }
        printGCD(num1, num2);
    }

    private static void printGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}

