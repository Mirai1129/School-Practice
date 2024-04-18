package tw.mirai1129.codejudger.tqc.practice.lesson1;

import java.util.Scanner;

public class JP107 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score1, score2, score3;

        try {
            score1 = sc.nextInt();
            if (score1 < 0) {
                score1 = 0;
            } else if (score1 > 100) {
                score1 = 100;
            }
        } catch (Exception e) {
            score1 = 0;
            sc.next();
        }
        try {
            score2 = sc.nextInt();
            if (score2 < 0) {
                score2 = 0;
            } else if (score2 > 100) {
                score2 = 100;
            }
        } catch (Exception e) {
            score2 = 0;
            sc.next();
        }
        try {
            score3 = sc.nextInt();
            if (score3 < 0) {
                score3 = 0;
            } else if (score3 > 100) {
                score3 = 100;
            }
        } catch (Exception e) {
            score3 = 0;
            sc.next();
        }

        int average = (score1 + score2 + score3) / 3;
        if (0 < average && average < 60) {
            System.out.print("failed:" + average);
        } else if (60 <= average && average < 100) {
            System.out.print("pass:" + average);
        } else if (average == 100){
            System.out.print("full mark:" + average);
        }
    }
}
