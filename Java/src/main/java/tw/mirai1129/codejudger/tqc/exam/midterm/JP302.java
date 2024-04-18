package tw.mirai1129.codejudger.tqc.exam.midterm;

import java.util.Scanner;

public class JP302 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			String[] weeks = {"Mon", "Tus", "Wed", "Thr", "Fri", "Sat", "Sun"};
			String input = sc.next();

			System.out.println(weeks[Integer.parseInt(input)]);
			// TO DO




		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}
