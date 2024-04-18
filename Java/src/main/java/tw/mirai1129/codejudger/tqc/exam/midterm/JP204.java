package tw.mirai1129.codejudger.tqc.exam.midterm;

import java.util.Scanner;

public class JP204 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 , num2;

		try {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 == 0 || num2 == 0) {
				System.out.println("error");
				return;
			}
		} catch (Exception e) {
			System.out.print("error");
			return;
		}
		printPrimeNumber(num1, num2);
	}
	private static void printPrimeNumber(int a, int b) {
		for (int i = a; i <= b; i++) {
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
