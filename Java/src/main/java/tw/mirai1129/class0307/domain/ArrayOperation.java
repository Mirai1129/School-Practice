package tw.mirai1129.class0307.domain;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    public int[] bubbleSort(int[] array) {
        int[] sortedList = Arrays.copyOf(array, array.length); // array name
        int temp;

        for (int i = 0; i < sortedList.length; ++i) { // current index in the array
            for (int j = 0; j < sortedList.length - 1 - i; ++j) { // compare the current number with every number
                if (sortedList[j] > sortedList[j + 1]) { // bigger number will exchange the position
                    // Swap elements
                    temp = sortedList[j];
                    sortedList[j] = sortedList[j + 1];
                    sortedList[j + 1] = temp;
                }
            }
        }
        System.out.println("Unsorted list: " + Arrays.toString(array));
        System.out.println("Sorted list: " + Arrays.toString(sortedList));

        return sortedList;
    }

    public boolean sequentialSearch(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number you want to search(sequential search): ");
        int numberToSearch = scanner.nextInt();
        for (int i = 0; i < array.length; ++i) {
            if (numberToSearch == array[i]) {
                System.out.println(array[i] + " is in array[" + i + "]");
                return true;
            }
        }
        // if not in array
        System.out.println(numberToSearch + " is not in array");
        return false;
    }

    public void binarySearch(int[] array) {
        Scanner scanner = new Scanner(System.in);

        // init left, right and middle position
        int left = 0, right = array.length - 1, middle = (left + right) / 2;
        System.out.print("Input the number you want to search(binary search): ");
        int numberToSearch = scanner.nextInt();

        // left data <= right data, there is the data can search
        while (left <= right) {
            if (numberToSearch == array[middle]) { // number = middle data
                break;
            } else if (numberToSearch > array[middle]) {
                left = middle + 1; // left data = middle + 1 position
            } else {
                right = middle - 1; // right data = middle - 1 position
            }
            middle = (left + right) / 2; // next search loop middle position
        }
        if (left <= right) { // left data position <= right data position -> get searched data
            System.out.println(numberToSearch + " is in array[" + middle + "]");
        } else {
            System.out.println(numberToSearch + " is not in array");
        }
        scanner.close();
    }
}
