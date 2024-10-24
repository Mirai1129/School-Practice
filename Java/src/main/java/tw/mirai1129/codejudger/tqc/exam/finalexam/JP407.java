package tw.mirai1129.codejudger.tqc.exam.finalexam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;


public class JP407 {

	public static void main(String[] args) {
		Random rand = new Random();
		int year = 0;
		try {
			Scanner sc = new Scanner(System.in);
			year = sc.nextInt();
			rand.setSeed(year);
			sc.close();
			if (year > 2018 || year < 2000) {
				System.out.println("error");
				return;
			}
			
            // TODO

		} catch (Exception ex) {
			System.out.print("error");
		}

        
		int minDay = (int) LocalDate.of(year, 1, 1).toEpochDay();
		int maxDay = (int)(int)LocalDate.of(year, 12, 31).toEpochDay();
		long randomDay = minDay + rand.nextInt(maxDay - minDay);
		LocalDate rd = LocalDate.ofEpochDay(randomDay);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		if (rd.getDayOfWeek().getValue() > 5) {
			rd = rd.plusDays(8 - rd.getDayOfWeek().getValue());
		}
        

		String output = rd.format(f);
		System.out.print(output);
	}
}
