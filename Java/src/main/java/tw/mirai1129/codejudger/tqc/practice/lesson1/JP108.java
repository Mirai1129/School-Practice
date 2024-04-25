package tw.mirai1129.codejudger.tqc.practice.lesson1;

import java.util.Scanner;

public class JP108 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			double input = sc.nextDouble();
			double result = f(input);
			System.out.printf("%.4f", result);

		} catch (Exception e) {
			System.out.print("error");
		}
	}

	public static double f(double num) {
		return 2 * Math.pow(num, 3) + 3 * num - 1;
	}
}
