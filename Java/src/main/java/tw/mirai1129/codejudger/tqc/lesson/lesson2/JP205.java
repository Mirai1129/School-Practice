package tw.mirai1129.codejudger.tqc.lesson.lesson2;

import java.util.Scanner;

public class JP205 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			int num1, num2;

			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 < 0 || num2 < 0) {
				System.out.println("error");
			} else {
				int result = findGcd(num1, num2);
				System.out.println(result);
			}

		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
	public static int findGcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
