package tw.mirai1129.codejudger.tqc.lesson.lesson2;

import java.util.Scanner;

public class JP203 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1, input2, input3;
        input1 = sc.next();
        input2 = sc.next();
        input3 = sc.next();

        int number1 = isNumerous(input1) ? Integer.parseInt(input1) : 0;
        int number2 = isNumerous(input2) ? Integer.parseInt(input2) : 0;
        int number3 = isNumerous(input3) ? Integer.parseInt(input3) : 0;

        printScoreRank(number1);
        printScoreRank(number2);
        printScoreRank(number3);

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

    public static void printScoreRank(int score) {
        if (score >= 85 && score <= 100) {
            System.out.println("A");
        } else if (score >= 60 && score < 85) {
            System.out.println("B");
        } else if (score >= 0 && score < 60) {
            System.out.println("C");
        }
    }
}
