package tw.mirai1129.codejudger.tqc.lesson.lesson2;

import java.util.Scanner;

public class JP209 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            String inputX = sc.next();
            String inputY = sc.next();

            double x = Double.parseDouble(inputX);
            double y = Double.parseDouble(inputY);


            String position = getPosition(x, y);

            // Check if x and y are integers
            if (x == (int) x && y == (int) y) {
                System.out.printf("(%.0f,%.0f) %s", x, y, position);
            } else if (x == (int) x) {
                System.out.printf("(%.0f,%." + countDecimalPlaces(y) + "f) %s", x, y, position);
            } else if (y == (int) y) {
                System.out.printf("(%." + countDecimalPlaces(x) + "f,%.0f) %s", x, y, position);
            } else {
                System.out.printf("(%." + countDecimalPlaces(x) + "f,%." + countDecimalPlaces(y) + "f) %s", x, y, position);
            }

        } catch (Exception e) {
            System.out.print("error");
            return;
        }
    }

    private static String getPosition(double x, double y) {
        String position;
        if (x == 0 && y == 0) {
            position = "origin";
        } else if (x == 0) {
            position = "Y";
        } else if (y == 0) {
            position = "X";
        } else if (x > 0 && y > 0) {
            position = "1";
        } else if (x < 0 && y > 0) {
            position = "2";
        } else if (x < 0 && y < 0) {
            position = "3";
        } else {
            position = "4";
        }
        return position;
    }

    private static int countDecimalPlaces(double value) {
        if (value == (long) value) {
            return 0;
        }
        String valueStr = Double.toString(Math.abs(value));
        int integerPlaces = valueStr.indexOf('.');
        return valueStr.length() - integerPlaces - 1;
    }
}
