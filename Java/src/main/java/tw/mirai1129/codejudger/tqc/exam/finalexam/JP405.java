package tw.mirai1129.codejudger.tqc.exam.finalexam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JP405 {

    public static void main(String[] args) {

        try {
            String[] names = { "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra",
                    "Scorpio", "Sagittarius", "Capricorn", "Capricorn" };
            int[] startDates = { 120, 219, 321, 420, 521, 621, 723, 823, 923, 1023, 1122, 1222, 101 };

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            sdf.setLenient(false);

            Date date = sdf.parse(input);
            SimpleDateFormat monthDayFormat = new SimpleDateFormat("MMdd");
            int monthDay = Integer.parseInt(monthDayFormat.format(date));

            for (int i = 0; i < startDates.length - 1; i++) {
                if (monthDay >= startDates[i] && monthDay < startDates[i + 1]) {
                    System.out.print(names[i]);
                    return;
                }
            }

            if (monthDay >= startDates[startDates.length - 2] || monthDay < startDates[0]) {
                System.out.print(names[startDates.length - 1]);
            }
        } catch (Exception e) {
            System.out.print("error");
        }
    }
}
