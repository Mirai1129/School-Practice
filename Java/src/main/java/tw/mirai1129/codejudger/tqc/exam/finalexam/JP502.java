package tw.mirai1129.codejudger.tqc.exam.finalexam;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class JP502 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            sc.close();
            // TO DO
            if (input.isEmpty()) {
                System.out.println("error");
                return;
            }
            File f = new File("write.txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(input);
            bw.flush();
            bw.close();

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            print(line);
            br.close();


        } catch (Exception e) {
            System.out.print("error");
            return;
        }
    }

    public static void print(String line) {
        System.out.print("write:" + line);
    }
}
