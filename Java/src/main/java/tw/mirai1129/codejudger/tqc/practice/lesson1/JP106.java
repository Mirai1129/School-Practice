package tw.mirai1129.codejudger.tqc.practice.lesson1;

import java.util.Scanner;

public class JP106 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4;
		int smallest, biggest;

		try {
			n1 = sc.nextInt();
			if (n1 < 0) {
				n1 = 0;
			}
		} catch (Exception e) {
			n1 = 0;
			sc.next();
		}
		try {
			n2 = sc.nextInt();
			if (n2 < 0) {
				n2 = 0;
			}
		} catch (Exception e) {
			n2 = 0;
			sc.next();
		}
		try {
			n3 = sc.nextInt();
			if (n3 < 0) {
				n3 = 0;
			}
		} catch (Exception e) {
			n3 = 0;
			sc.next();
		}
		try {
			n4 = sc.nextInt();
			if (n4 < 0) {
				n4 = 0;
			}
		} catch (Exception e) {
			n4 = 0;
			sc.next();
		}

		smallest = Math.min(Math.min(n1, n2), Math.min(n3, n4));
		biggest = Math.max(Math.max(n1, n2), Math.max(n3, n4));


        System.out.println("smallest:" + smallest);
		System.out.print("largest:" + biggest);
	}

}
