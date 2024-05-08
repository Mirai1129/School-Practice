package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Scanner;

public class JP309 {

	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			// 檢查輸入是否在1-20範圍內
			if (input < 1 || input > 20) {
				System.out.println("error");
				return;
			}

			// 計算階乘並輸出結果
			int result = compute(input);
			System.out.println(result);

		} catch (Exception e) {
			System.out.print("error");
		}
	}

	public static int compute(int i) {
		// 計算階乘
		if (i == 0) {
			return 1;
		} else {
			return i * compute(i - 1);
		}
	}
}
