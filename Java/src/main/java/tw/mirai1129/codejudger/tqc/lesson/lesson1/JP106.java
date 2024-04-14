package tw.mirai1129.codejudger.tqc.lesson.lesson1;

import java.util.Scanner;

public class JP106 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4;
        int smallest = 0, biggest = 0;

        try {
            String input1 = sc.next();
            String input2 = sc.next();
            String input3 = sc.next();
            String input4 = sc.next();

            n1 = isNumeric(input1) ? Math.max(Integer.parseInt(input1), 0) : 0;
            n2 = isNumeric(input2) ? Math.max(Integer.parseInt(input2), 0) : 0;
            n3 = isNumeric(input3) ? Math.max(Integer.parseInt(input3), 0) : 0;
            n4 = isNumeric(input4) ? Math.max(Integer.parseInt(input4), 0) : 0;

            smallest = Math.min(Math.min(n1, n2), Math.min(n3, n4));
            biggest = Math.max(Math.max(n1, n2), Math.max(n3, n4));
        } catch (Exception e) {
            System.out.println("wrong type");
        }


        System.out.println("smallest:" + smallest);
        System.out.println("largest:" + biggest);
    }

    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
