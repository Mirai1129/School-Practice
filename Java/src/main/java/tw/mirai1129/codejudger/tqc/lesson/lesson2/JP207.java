package tw.mirai1129.codejudger.tqc.lesson.lesson2;

import java.util.Scanner;

public class JP207 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (int i = 0; i <= input.length(); i++) {
            System.out.println("ASCII code for '" + input.charAt(i) + "' is " + (int) input.charAt(i));
        }
    }
}
