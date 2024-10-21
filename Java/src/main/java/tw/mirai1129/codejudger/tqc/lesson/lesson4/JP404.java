package tw.mirai1129.codejudger.tqc.lesson.lesson4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JP404 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputDate = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        sdf.setLenient(false);

        try {
            // 解析輸入的日期字符串
            Date date = sdf.parse(inputDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // 計算上週的開始和結束日期
            // 如果當前日期是星期日，則這一天算作上週的最後一天
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                calendar.add(Calendar.DATE, -6);
            } else {
                calendar.add(Calendar.DATE, -calendar.get(Calendar.DAY_OF_WEEK) + Calendar.MONDAY - 7);
            }
            Date startDate = calendar.getTime();

            // 上週的結束日期
            calendar.add(Calendar.DATE, 6);
            Date endDate = calendar.getTime();

            // 輸出格式化的結果
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
            System.out.print(outputFormat.format(startDate) + "-" + outputFormat.format(endDate));
        } catch (Exception e) {
            System.out.print("error");
        }
    }
}
