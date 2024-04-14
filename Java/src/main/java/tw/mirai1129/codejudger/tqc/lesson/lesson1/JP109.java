package tw.mirai1129.codejudger.tqc.lesson.lesson1;

import java.util.Scanner;

public class JP109 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        int first = input.charAt(0); // ascii
        char firstChar = transferAscii(first);

        if (!isValidChar(firstChar)) {
            System.out.println("error");
            return;
        }


        if (input.length() == 1) {
            System.out.println(firstChar);
        } else {
            int last = input.charAt(input.length() - 1);
            char lastChar = transferAscii(last);

            if (!isValidChar(lastChar)) {
                System.out.println("error");
                return;
            }

            String middle = input.substring(1, input.length() - 1);
            System.out.println(firstChar + middle + lastChar);
        }
    }


    public static boolean isValidChar(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    public static char transferAscii(int singleChar) {
        if (65 <= singleChar && singleChar <= 90) {
            return (char) (singleChar + 32 + 1);
        } else if (97 <= singleChar && singleChar <= 122) {
            return (char) (singleChar - 32 + 1);
        } else if (48 <= singleChar && singleChar <= 57) {
            if (singleChar == 57) {
                return (char) (singleChar - 9);
            }
            return (char) (singleChar + 1);
        }
        return 0;
    }
}
