package tw.mirai1129.codejudger.tqc.exam.finalexam;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class JP505 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("read.txt"));
            String line;
            String[] name = new String[13];
            int[] total = new int[13];

            for (int i = 0; (line = br.readLine()) != null && i < 13; i++) {
                String[] data = line.split(",");
                name[i] = data[0];
                total[i] = Integer.parseInt(data[3]) + Integer.parseInt(data[4]) + Integer.parseInt(data[5]);
            }

            br.close();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner.close();
            String[] judge = input.split(" ");
            int num = 0;
            StringBuilder resultBuilder = new StringBuilder();

            for (int j = 0; j < 13; j++) {
                if (checkCondition(total[j], judge[0], Integer.parseInt(judge[1]))) {
                    num++;
                    resultBuilder.append(name[j]).append(" ").append(total[j]).append(",");
                }
            }

            System.out.println(num);
            String[] results = resultBuilder.toString().split(",");
            for (String result : results) {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.print("error");
        }
    }

    private static boolean checkCondition(int score, String operator, int targetScore) {
        switch (operator) {
            case ">":
                return score > targetScore;
            case "<":
                return score < targetScore;
            case "=":
                return score == targetScore;
            case ">=":
                return score >= targetScore;
            case "<=":
                return score <= targetScore;
            default:
                System.out.print("error");
                System.exit(0);
                return false;
        }
    }
}
