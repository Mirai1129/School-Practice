package tw.mirai1129.codejudger.tqc.lesson.lesson5;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class JP504 {
    public static void main(String[] args) {
        String[] new_student = {"Sam", "1981/10/1", "A234567890"};
        String[] combine = new String[6];
        System.arraycopy(new_student, 0, combine, 0, 3);
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            sc.close();
            String[] data = input.split(" ");
            for (int i = 0; i < 3; i++) {
                int chk = Integer.parseInt(data[i]);
                if (chk < 0 || chk > 100) {
                    System.out.print("error");
                    return;
                }
            }
            StringBuilder result = new StringBuilder();
            System.arraycopy(data, 0, combine, 3, 3);
            for (int i = 0; i < 5; i++) {
                result.append(combine[i]).append(",");
            }
            result.append(combine[5]);
            System.out.print(result);
            File f = new File("write.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(result + "\r\n");
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
            System.out.print("error");
        }
    }
}
