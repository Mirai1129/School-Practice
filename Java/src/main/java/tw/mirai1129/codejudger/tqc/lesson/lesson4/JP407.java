package tw.mirai1129.codejudger.tqc.lesson.lesson4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class JP407 {
    public static void main(String[] args) {
        Random rand = new Random();
        int year = 0;
        try {
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
            rand.setSeed(year);//執行亂數產生種子
            sc.close();
            if (year > 2018 || year < 2000) {
                System.out.print("error");
                return;
            }
        } catch (Exception ex) {
            System.out.print("error");
        }
        int minDay = (int) LocalDate.of(year, 1, 1).toEpochDay(); // Date of 1/1
        int maxDay = (int) (int) LocalDate.of(year, 12, 31).toEpochDay();
        ; // Date of 12/31
        long randomDay = minDay + rand.nextInt(maxDay - minDay);
        LocalDate rd = LocalDate.ofEpochDay(randomDay);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        if (rd.getDayOfWeek().getValue() > 5) {
            rd = rd.plusDays(8 - rd.getDayOfWeek().getValue());
        }
        String output = rd.format(f);
        System.out.print(output);
    }
}
