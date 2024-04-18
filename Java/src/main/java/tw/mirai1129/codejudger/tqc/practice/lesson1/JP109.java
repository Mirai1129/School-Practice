package tw.mirai1129.codejudger.tqc.practice.lesson1;

import java.util.Scanner;

public class JP109 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();

		int first = input.charAt(0);
		if (input.length() == 1) {
			System.out.println((char) first + 1);
		}

		// TO DO

	}
}
