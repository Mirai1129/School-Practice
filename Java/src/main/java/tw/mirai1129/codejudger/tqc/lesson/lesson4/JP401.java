package tw.mirai1129.codejudger.tqc.lesson.lesson4;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JP401 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();

			// 檢查輸入是否為8位數字
			if (input.length() != 8 || !input.matches("\\d{8}")) {
				throw new Exception();
			}

			// 提取年、月、日
			String year = input.substring(0, 4);
			String month = input.substring(4, 6);
			String day = input.substring(6, 8);

			// 組成日期格式
			String dateString = year + "/" + month + "/" + day;

			// 定義日期格式
			SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy/MM/dd");
			inputFormat.setLenient(false);

			// 解析並格式化日期
			Date date = inputFormat.parse(dateString);
			SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd EEE");
			String output = outputFormat.format(date);

			System.out.print(output);
		} catch (Exception ex) {
			System.out.print("error");
		}
	}
}
