package tw.mirai1129.codejudger.tqc.exam.midterm;

import java.util.Scanner;

public class JP109 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        int first = input.charAt(0);
        if (!isLegal(first)) {
            System.out.println("error");
            return;
        }

        if (input.length() == 1) {
            System.out.println((char) transferAscii(first));
        } else {
            int last = input.charAt(input.length()-1);
            if (!isLegal(last)) {
                System.out.println("error");
            }
            String middle = input.substring(1, input.length()-1);
            System.out.println((char) transferAscii(first) + middle + (char) transferAscii(last));
        }

        // TO DO

    }

    private static boolean isLegal(int ch) {
        return (48 <= ch && ch <= 57) || (65 <= ch && ch <= 90) || (97 <= ch && ch <= 122);
    }

    private static int transferAscii(int ch) {
        if (65 <= ch && ch <= 90) {
            ch = ch + 32 + 1;
        } else if (97 <= ch && ch <= 122) {
            ch = ch - 32 + 1;
        } else if (48 <= ch && ch <= 57) {
            if (ch == 57) {
                ch = ch - 9;
            } else {
                ch++;
            }
        } else {
            return 0;
        }
        return ch;
    }
}
