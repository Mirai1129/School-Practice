package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Scanner;

public class JP310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// 讓使用者輸入一個整數
			int input = sc.nextInt();
			// 檢查輸入是否為負數，若是則取絕對值
			if (input == 0) {
				System.out.println("error");
				return;
			}

			if (input < 0) {
				input = Math.abs(input);
			}
			// 計算並輸出結果
			int result = compute(input);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	public static int compute(int n) {
		// 若輸入為 1，回傳 2
		if (n == 1) {
			return 2;
		}
		// 若輸入為其他數字，則根據公式遞迴計算
		return compute(n - 1) + 3 * n;
	}
}
