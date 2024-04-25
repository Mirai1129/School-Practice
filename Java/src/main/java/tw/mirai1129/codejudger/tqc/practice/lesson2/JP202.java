package tw.mirai1129.codejudger.tqc.practice.lesson2;

import java.util.Scanner;

public class JP202 {

    public static void main(String[] args) {

        int number;

        try {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();

        } catch (Exception e) {
            System.out.println("error");
            return;
        }

        if (number % 2 == 0) {
            System.out.print(number + " is an even number.");
        } else {
            System.out.print(number + " is an odd number.");
        }
    }
}
