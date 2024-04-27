package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JP307 {

	public static void main(String[] argv) {
		List<String> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		while (!line.equals("999")) { // Compare as strings
			list.add(line);
			line = sc.nextLine();
		}

		System.out.print("before:");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + " ");
			}
		}

		String[] result = compute(list.toArray(new String[0]));
		System.out.print("\nafter:");
		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + " ");
			}
		}
	}

	public static String[] compute(String[] array) {
		// In this example, let's reverse the order of strings in the array
		for (int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}
}
