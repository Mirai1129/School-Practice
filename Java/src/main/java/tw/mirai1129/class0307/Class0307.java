package tw.mirai1129.class0307;

import tw.mirai1129.class0307.domain.ArrayOperation;

public class Class0307 {
    public static void main(String[] args) {
        ArrayOperation arrayOperation = new ArrayOperation();

        int[] array = {5, 7, 12, 16, 26, 58, 71};

        int[] bubbleSortArray = arrayOperation.bubbleSort(array);
        arrayOperation.sequentialSearch(array);
        arrayOperation.binarySearch(array);
    }
}
