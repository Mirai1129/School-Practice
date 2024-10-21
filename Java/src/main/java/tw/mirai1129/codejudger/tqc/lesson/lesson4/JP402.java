package tw.mirai1129.codejudger.tqc.lesson.lesson4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class JP402 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String date1 = sc.nextLine();
            String date2 = sc.nextLine();

            // 日期格式為"yyyyMMdd"
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            sdf.setLenient(false);

            // 解析輸入的日期字符串
            Date d1 = sdf.parse(date1);
            Date d2 = sdf.parse(date2);

            // 計算兩日期之間的毫秒差
            long diffInMillies = Math.abs(d1.getTime() - d2.getTime());
            // 將毫秒差轉換為天數
            long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            // 輸出結果，不自動換行
            System.out.print(diffInDays);
        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
