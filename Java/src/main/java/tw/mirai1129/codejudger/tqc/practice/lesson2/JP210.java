package tw.mirai1129.codejudger.tqc.practice.lesson2;

import java.util.Scanner;

public class JP210 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			int num1 = 25;
			int num2;
			int result;
			num2 = sc.nextInt();
			result = num1 / num2;

			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("error:DivideByZeroException");
		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}

}
