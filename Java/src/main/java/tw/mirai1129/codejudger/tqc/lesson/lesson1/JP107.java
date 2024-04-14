package tw.mirai1129.codejudger.tqc.lesson.lesson1;

import java.util.Scanner;

public class JP107 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score1, score2, score3, average = 0;

        try {
            String input1 = sc.next();
            String input2 = sc.next();
            String input3 = sc.next();

            score1 = isNumerous(input1) ? Integer.parseInt(input1) : 0;
            score2 = isNumerous(input2) ? Integer.parseInt(input2) : 0;
            score3 = isNumerous(input3) ? Integer.parseInt(input3) : 0;

            score1 = score1 < 0 ? 0 : Math.min(score1, 100);
            score2 = score2 < 0 ? 0 : Math.min(score2, 100);
            score3 = score3 < 0 ? 0 : Math.min(score3, 100);

            average = (score1 + score2 + score3) / 3;

        } catch (Exception e) {
            System.out.println("wrong type");
        }

        if (average < 60) {
            System.out.print("failed:" + average);
        } else if (average < 100) {
            System.out.print("pass:" + average);
        } else {
            System.out.print("full mark:" + average);
        }
    }

    public static boolean isNumerous(String string) {
        if (string == null) {
            return false;
        }
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
