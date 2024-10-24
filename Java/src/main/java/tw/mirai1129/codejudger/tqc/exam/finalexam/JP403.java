package tw.mirai1129.codejudger.tqc.exam.finalexam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JP403 {

    public static void main(String[] args) {
        // 定義已經存在的會議時間和持續小時數
        String[] meetingDates = {"2018/12/01 14:00", "2018/12/02 15:00", "2018/12/03 10:30", "2018/12/03 15:30", "2018/12/04 15:00"};
        int[] meetingHours = {1, 3, 4, 2, 5};

        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            // 定義日期格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
            sdf.setLenient(false); // 設定為不寬容模式

            // 解析輸入的會議時間
            Date newMeetingStart = sdf.parse(input);

            for (int i = 0; i < meetingDates.length; i++) {
                Date existingMeetingStart = sdf.parse(meetingDates[i]);

                // 計算現有會議的結束時間
                Calendar cal = Calendar.getInstance();
                cal.setTime(existingMeetingStart);
                cal.add(Calendar.HOUR, meetingHours[i]);
                Date existingMeetingEnd = cal.getTime();

                // 檢查新的會議時間是否與現有會議時間重疊
                if (!newMeetingStart.after(existingMeetingEnd) && !newMeetingStart.equals(existingMeetingEnd)) {
                    if (!newMeetingStart.before(existingMeetingStart)) {
                        System.out.print("Has already reserved - " + sdf.format(existingMeetingStart));
                        return;
                    }
                }
            }

            // 若沒有重疊，則輸出預定完成
            System.out.print("Reservation completed - " + sdf.format(newMeetingStart));

        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
