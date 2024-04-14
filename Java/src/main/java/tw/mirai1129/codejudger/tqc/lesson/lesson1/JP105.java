package tw.mirai1129.codejudger.tqc.lesson.lesson1;

import java.util.Scanner;

public class JP105 {

    public static void main(String[] args) {
        String dreams = "There are moments in life when you miss someone so much that "
                + "you just want to pick them from your dreams and hug them for real! Dream what "
                + "you want to dream;go where you want to go;be what you want to be,because you have "
                + "only one life and one chance to do all the things you want to do";

        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        sc.close();

        int searchLength = search.length();

        int first = dreams.indexOf(search);
        int last = dreams.lastIndexOf(search);

        String result;

        // if no index of the search
        if (first == -1) {
            result = "";
            first++;
            last++;
        } else if (first != 0 && first == last) { // if only one word in the dreams
            last = 0;
            result = dreams.substring(first);
            first++;
        } else { // if more than one word
            result = dreams.substring(first, last + searchLength);
            first++;
            last++;
        }

        System.out.println("first:" + first);
        System.out.println("last:" + last);
        System.out.print("capture:" + result);
    }
}
