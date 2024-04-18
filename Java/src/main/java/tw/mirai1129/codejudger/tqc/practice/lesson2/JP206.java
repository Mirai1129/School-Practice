package tw.mirai1129.codejudger.tqc.practice.lesson2;

import java.util.Scanner;

public class JP206 {

	public static void main(String[] args) {

		final String dreams = "There are moments in life when you miss someone so much that "
				+ "you just want to pick them from your dreams and hug them for real! Dream what "
				+ "you want to dream; go where you want to go; be what you want to be, because you have "
				+ "only one life and one chance to do all the things you want to do";

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int index = 0;
		int count = 0;

		while ((index = dreams.indexOf(input, index)) != -1) {
			count++;
			index += input.length();
		}
		System.out.println(count);
	}
}
