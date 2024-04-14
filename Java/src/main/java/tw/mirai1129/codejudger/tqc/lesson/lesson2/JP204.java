package tw.mirai1129.codejudger.tqc.lesson.lesson2;

import java.util.Scanner;

public class JP204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int smallNumber = 0, bigNumber = 0;

		try {
			smallNumber = sc.nextInt();
			bigNumber = sc.nextInt();
		} catch (Exception e) {
			System.out.print("error");
			return;
		}

		if (smallNumber < 1 || bigNumber < 1) {
			System.out.println("error");
			return;
		}

		primeNumber(smallNumber, bigNumber);
	}

	public static void primeNumber(int num1, int num2) {
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
