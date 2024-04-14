package tw.mirai1129.codejudger.tqc.lesson.lesson1;

import java.util.Scanner;

public class JP102 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try {
            a = sc.nextInt();
        } catch (Exception ex) {
            a = 0;
            sc.next();
        }
        try {
            b = sc.nextInt();
        } catch (Exception ex) {
            b = 0;
            sc.next();
        }
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println(a + b);
        } else if (a % 2 == 1 && b % 2 == 0) {
            System.out.println(b);
        } else if (a % 2 == 0 && b % 2 == 1) {
            System.out.println(a);
        } else {
            System.out.println(0);
        }
    }
}
