package tw.mirai1129.codejudger.tqc.lesson.lesson2;

import java.util.Scanner;

public class JP202 {

    public static void main(String[] args) {

        int input;

        try {
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();

        } catch (Exception e) {
            System.out.println("error");
            return;
        }

        if (input % 2 == 0) {
            System.out.print(input +" is an even number.");
        } else {
            System.out.print(input +" is an odd number.");
        }
    }


}
