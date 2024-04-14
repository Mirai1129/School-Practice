package tw.mirai1129.codejudger.tqc.lesson.lesson1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JP110 {
    // 請撰寫程式，讓使用者輸入三個正整數，分別代表存錢筒中的一元、五元及十元的硬幣數量，
    // 計算存錢筒的總金額並輸出，金額需格式化輸出為三位一撇的千分號，顯示【x,xxx】。
    // 若輸入值為負數、帶有小數點的數字資料或非數字，請轉換為0。
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = 0, n5 = 0, n10 = 0;

        try {
            String input1 = sc.next();
            String input2 = sc.next();
            String input3 = sc.next();

            n1 = isValidNumber(input1) ? Integer.parseInt(input1) : 0;
            n5 = isValidNumber(input2) ? Integer.parseInt(input2) : 0;
            n10 = isValidNumber(input3) ? Integer.parseInt(input3) : 0;

        } catch (Exception e) {
            System.out.println("error");
            return;
        }

        int totalAmount = n1 + 5 * n5 + 10 * n10;

        DecimalFormat formatter = new DecimalFormat("#,###");
        String formattedAmount = formatter.format(totalAmount);

        System.out.println(formattedAmount);
    }

    public static boolean isValidNumber(String string) {
        try {
            double number = Double.parseDouble(string);
            return number >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
