package tw.mirai1129.codejudger.tqc.practice.lesson2;

import java.util.Scanner;

public class JP203 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        num1 = inputNumber(sc);
        num2 = inputNumber(sc);
        num3 = inputNumber(sc);

        printRank(num1);
        printRank(num2);
        printRank(num3);
    }

    private static int inputNumber(Scanner sc) {
        int number;
        try {
            number = sc.nextInt();
        } catch (Exception e) {
            number = 0;
        }
        return number;
    }

    private static void printRank(int number) {
        if (number >= 85 && number <= 100) {
            System.out.println("A");
        } else if (number >= 60 && number < 80) {
            System.out.println("B");
        } else if (number >= 0 && number < 60) {
            System.out.println("C");
        }
    }
}
