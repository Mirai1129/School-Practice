package tw.mirai1129.codejudger.tqc.exam.midterm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JP110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = 0, n5 = 0, n10 = 0;

        try {
            n1 = sc.nextInt();
            if (n1 < 0) {
                n1 = 0;
            }
        } catch (Exception e) {
            n1 = 0;
            sc.next();
        }
        try {
            n5 = sc.nextInt();
            if (n5 < 0) {
                n5 = 0;
            }
        } catch (Exception e) {
            n5 = 0;
            sc.next();
        }
        try {
            n10 = sc.nextInt();
            if (n10 < 0) {
                n10 = 0;
            }
        } catch (Exception e) {
            n10 = 0;
            sc.next();
        }

        int result = 0;
        result = n1 + n5 * 5 + n10 * 10;
        // TO DO

        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println(formatter.format(result));
        // TO DO
    }
}
