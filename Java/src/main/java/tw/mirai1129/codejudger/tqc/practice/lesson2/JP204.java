package tw.mirai1129.codejudger.tqc.practice.lesson2;

import java.util.Scanner;

public class JP204 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2;

		try {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		} catch (Exception e) {
			System.out.print("error");
			return;
		}

		if (num1 < 1 || num2 < 1) {
			System.out.println("error");
			return;
		}
		printPrimeNumber(num1, num2);
	}

	private static void printPrimeNumber(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				if (i == 1) {
					continue;
				}
				System.out.println(i);
			}
		}
	}
}
