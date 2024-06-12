package tw.mirai1129.codejudger.tqc.lesson.lesson4;

import java.util.Scanner;

public class JP410 {

	public static void main(String[] args) {
		// 預先定義的生日陣列
		String[] birthday = {
				"1980/1/11", "1985/3/2", "1985/12/3", "1986/6/3", "1986/11/14",
				"1987/2/2", "1987/8/1", "1987/10/12", "1987/9/3", "1987/8/1",
				"1987/4/12", "1988/1/3", "1987/5/6", "1987/6/7", "1987/8/19",
				"1987/6/13", "1987/10/9", "1986/4/8", "1987/5/15", "1987/2/19",
				"1987/3/15", "1987/3/11", "1987/3/31"
		};

		try {
			Scanner sc = new Scanner(System.in);
			int month = sc.nextInt();
			sc.close();

			// 檢查輸入的月份是否在合法範圍內 (1到12)
			if (month < 1 || month > 12) {
				System.out.print("error");
				return;
			}

			// 計算指定月份的生日人數
			int count = 0;
			for (String date : birthday) {
				String[] parts = date.split("/"); // 使用 "/" 分割日期
				int birthMonth = Integer.parseInt(parts[1]); // 取得月份部分
				if (birthMonth == month) {
					count++;
				}
			}

			// 輸出生日人數
			System.out.print(count);

		} catch (Exception ex) {
			// 如果輸入非法或發生異常，輸出 error
			System.out.print("error");
		}
	}
}

