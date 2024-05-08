package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Scanner;

public class JP308 {

	public static void main(String[] args) {
		// 成績清單
		int[] scores = { 100, 100, 95, 95, 92, 91, 90, 100, 88, 88, 87, 87, 90, 91, 85, 80, 81, 82, 82, 89 };

		try {
			Scanner sc = new Scanner(System.in);
			int inputScore = sc.nextInt();

			int count = 0;
			for (int score : scores) {
				if (score == inputScore) {
					count++;
				}
			}

			System.out.println(count);

		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
