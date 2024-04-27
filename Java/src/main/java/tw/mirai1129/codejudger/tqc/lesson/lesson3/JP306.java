package tw.mirai1129.codejudger.tqc.lesson.lesson3;

import java.util.Scanner;

public class JP306 {

    public static void main(String args[]) {

        int a[][] = {{1, 2, 3}, {4, 5, 6}};
        int b[][] = new int[2][3];
        int c[][] = new int[2][3];

        Scanner sc = new Scanner(System.in);
        try{
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
        } catch (Exception e){
            System.out.println("error");
            return;
        }


        compute(a, b, c);
        print(c);
    }

    public static void compute(int[][] a, int[][] b, int[][] c) {
        for (int i = 0; i < a.length; i++) { // iterate over rows of matrix a
            for (int j = 0; j < a[i].length; j++) { // iterate over columns of matrix a
                c[i][j] = a[i][j] + b[i][j]; // perform addition
            }
        }
    }

    public static void print(int[][] s) {
        for (int i = 0; i < s.length; i++) { // iterate over rows
            for (int j = 0; j < s[i].length; j++) { // iterate over columns
                System.out.printf("%4d", s[i][j]); // print the element
            }
            System.out.println(); // move to the next line after printing each row
        }
    }
}
