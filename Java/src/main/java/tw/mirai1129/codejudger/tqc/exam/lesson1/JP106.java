package tw.mirai1129.codejudger.tqc.exam.lesson1;

import java.util.Scanner;

public class JP106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1, n2, n3, n4;
		int smallest = 0, biggest = 0;

		try {

			n1 = sc.next();
			n2 = sc.next();
			n3 = sc.next();
			n4 = sc.next();

			int number1 = isValidNumber(n1) && Integer.parseInt(n1) >= 0 ? Integer.parseInt(n1) : 0;
			int number2 = isValidNumber(n2) && Integer.parseInt(n2) >= 0 ? Integer.parseInt(n2) : 0;
			int number3 = isValidNumber(n3) && Integer.parseInt(n3) >= 0 ? Integer.parseInt(n3) : 0;
			int number4 = isValidNumber(n4) && Integer.parseInt(n4) >= 0 ? Integer.parseInt(n4) : 0;

			smallest = Math.min(Math.min(number1, number2), Math.min(number3, number4));
			biggest = Math.max(Math.max(number1, number2), Math.max(number3, number4));



		} catch (Exception e) {


			System.out.println("error");


		}

        System.out.println("smallest:" + smallest);
		System.out.print("largest:" + biggest);
	}
	public static boolean isValidNumber(String input) {
		if (input == null) {
			return false;
		}
		try	{
			int a = Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
