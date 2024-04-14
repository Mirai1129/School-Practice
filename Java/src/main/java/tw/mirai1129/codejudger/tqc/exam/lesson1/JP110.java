package tw.mirai1129.codejudger.tqc.exam.lesson1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JP110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = 0, n5 = 0, n10 = 0;
        int result = 0;

        try {
            String input1 = sc.next();
            String input2 = sc.next();
            String input3 = sc.next();

            n1 = isValidNumber(input1) ? Integer.parseInt(input1) : 0;
            n5 = isValidNumber(input2) ? Integer.parseInt(input2) * 5 : 0;
            n10 = isValidNumber(input3) ? Integer.parseInt(input3) * 10 : 0;



        } catch (Exception e) {
            System.out.println("error");
            return;
        }
        result = n1 + n5 + n10;

        DecimalFormat formatter = new DecimalFormat("#,###");
        String formattedResult = formatter.format(result);
        System.out.println(formattedResult);
    }

    public static boolean isValidNumber(String input) {
        if (input == null) {
            return false;
        }
        try {
            int a = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
