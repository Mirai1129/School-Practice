package tw.mirai1129.class0307.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayOperationTest {
    private int[] array;

    @BeforeEach
    public final void setup() {
        array = new int[]{90, 6, 60, 10, 58};
    }

    @Test
    @DisplayName("array need to be sorted")
    public void testBubbleSort() {
        ArrayOperation arrayOperation = new ArrayOperation();
        int[] sortedArray = arrayOperation.bubbleSort(array);

        // Assert sortedArray is sorted in ascending order
        assertArrayEquals(new int[]{6, 10, 58, 60, 90}, sortedArray);
    }
}
