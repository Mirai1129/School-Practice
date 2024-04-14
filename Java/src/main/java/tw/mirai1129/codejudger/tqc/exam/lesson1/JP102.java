package tw.mirai1129.codejudger.tqc.exam.lesson1;

import java.util.Scanner;

public class JP102 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            String input1 = sc.next();
            String input2 = sc.next();
            sc.close();

            int num1 = isNumerous(input1) ? Integer.parseInt(input1) : 0;
            int num2 = isNumerous(input2) ? Integer.parseInt(input2) : 0;

            if (num1 % 2 == 1 && num2 % 2 == 1) {
                System.out.println(0);
            } else if (num1 % 2 == 0 && num2 % 2 == 1) { // num1 // 2
                System.out.println(num1);
            } else if (num1 % 2 == 1 && num2 % 2 == 0) { // num2 // 2
                System.out.println(num2);
            } else {
                System.out.println(num1 + num2);
            }


        } catch (Exception ex) {
            System.out.println("error");
        }
    }

    public static boolean isNumerous(String input) {
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
