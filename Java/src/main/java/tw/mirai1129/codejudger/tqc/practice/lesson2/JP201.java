package tw.mirai1129.codejudger.tqc.practice.lesson2;

import java.util.Scanner;

public class JP201 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num1, num2;

		try {
			num1 = sc.nextDouble();
		} catch (Exception e) {
			num1 = 0;
			sc.next();
		}
		try {
			num2 = sc.nextDouble();
		} catch (Exception e) {
			num2 = 0;
			sc.next();
		}
		String result1 = String.valueOf(num1);
		String result2 = String.valueOf(num2);
		if (num1 == (int) num1) {
			result1 = String.valueOf((int) num1);
		}
		if (num2 == (int) num2) {
			result2 = String.valueOf((int) num2);
		}


		if (num1 == num2) {
			System.out.println(result1 + "=" + result2);
		} else if (num1 < num2) {
			System.out.println(result1 + "<" + result2);
		} else if (num1 > num2) {
			System.out.println(result1 + ">" + result2);
		}
	}
}
