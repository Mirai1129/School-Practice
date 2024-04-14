package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Scanner;

public class JP302 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			String[] weeks = {"Mon", "Tus", "Wed", "Thr", "Fri", "Sat", "Sun"};

			int n = sc.nextInt();

			if (n >= 0 && n <= 6) {
				System.out.println(weeks[n]);
			} else {
				System.out.println("error");
			}
		} catch (Exception e) {
			System.out.print("error");
        }
	}
}

