package tw.mirai1129.codejudger.tqc.exam.midterm;

import java.util.Scanner;

public class JP205 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			int num1, num2;
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			if (num1 < 0 || num1 > 100) {
				System.out.println("error");
				return;
			}
			if (num2 < 0 || num2 > 100) {
				System.out.println("error");
				return;
			}
			printGCD(num1, num2);

		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
	private static void printGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println(a);
	}
}
