package tw.mirai1129.codejudger.tqc.lesson.lesson2;

import java.util.Scanner;

public class JP201 {

    public static void main(String[] args) {
        // 請撰寫程式，讓使用者輸入兩個數字a、b，判斷兩個數字的大小，
        // 並輸出結果為【a=b】或【a<b】、【a>b】（中間無空格）。
        // 若輸入文字，請轉換為0。

        Scanner sc = new Scanner(System.in);
        double a = getCorrectNumberFromInput(sc.next());
        double b = getCorrectNumberFromInput(sc.next());

        if (a == b) {
            System.out.print(outputResult(a) + "=" + outputResult(b));
        } else if (a < b) {
            System.out.print(outputResult(a) + "<" + outputResult(b));
        } else {
            System.out.print(outputResult(a) + ">" + outputResult(b));
        }
    }

    public static double getCorrectNumberFromInput(String inputValue) {
        try {
            return Double.parseDouble(inputValue);
        } catch (Exception e) {
            return 0;
        }
    }

    public static String outputResult(double num) {
        if (num % 1 == 0) {
            return String.valueOf((int) num);
        } else {
            return String.valueOf(num);
        }
    }
}
