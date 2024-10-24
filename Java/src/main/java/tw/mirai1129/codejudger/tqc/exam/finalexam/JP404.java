package tw.mirai1129.codejudger.tqc.exam.finalexam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class JP404 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputDate = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		// TO DO
		sdf.setLenient(false);
		// TO DO


		try {
			Date date = sdf.parse(inputDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				calendar.add(Calendar.DATE, -6);
			} else {
				calendar.add(Calendar.DATE, -calendar.get(Calendar.DAY_OF_WEEK) + Calendar.MONDAY - 7);
			}
			Date startDate = calendar.getTime();
			calendar.add(Calendar.DATE, 6);
			Date endDate = calendar.getTime();
			SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println(outputFormat.format(startDate) + "-" + outputFormat.format(endDate));
			// TO DO

		} catch (Exception e) {
			System.out.print("error");
			return;
		}


			// TO DO

	}
}
