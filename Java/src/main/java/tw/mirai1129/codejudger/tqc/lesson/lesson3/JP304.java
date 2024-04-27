package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class JP304 {

	public static void main(String[] args) {

		int[] scores = { 100, 100, 95, 95, 92, 91, 90, 100, 88, 88, 87, 87, 90, 91, 85, 80, 81, 82, 82, 89 };
		Scanner sc = new Scanner(System.in);
		int removeValue;
		int sum = 0;
		int count = 0;
		double average = 0;

		try {
			removeValue = sc.nextInt();
		} catch (Exception e) {
			removeValue = 0;
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == removeValue) {
				scores[i] = 0;
				count++;
			}
			sum += scores[i];
		}
		average = (double) sum / (scores.length - count);
		System.out.printf("%.2f", average);
	}
}
