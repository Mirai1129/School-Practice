package tw.mirai1129.codejudger.tqc.lesson.lesson4;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class JP406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try {
            n = sc.nextInt();
            sc.close();
            if (n >= 1 && n <= 100) {
                Random random = new Random(n);
                ArrayList<Integer> list = new ArrayList<>();
                while (list.size() < 10) {
                    int r = random.nextInt(100) + 1;
                    if (list.contains(r)) {
                        continue;
                    }
                    list.add(r);
                }
                for (int item : list) {
                    System.out.print(item + " ");
                }
            } else {
                System.out.println("error");
            }
        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
