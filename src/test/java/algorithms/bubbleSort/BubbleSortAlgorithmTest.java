package algorithms.bubbleSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortAlgorithmTest {

    int[] arrayToSort = {-1, 4, -3, 2, 51};
    int[] resultAscending = {-3, -1, 2, 4, 51};
    int[] resultDescending = {51, 4, 2, -1, -3};
    BubbleSortAlgorithm tempBubbleSortObject = new BubbleSortAlgorithm();

    @Test
    public void bubleSortNullObject() {
        assertFalse(tempBubbleSortObject.equals(null));
    }

    @Test
    public void bubbleSortMethodAscending() {
        assertArrayEquals(resultAscending, tempBubbleSortObject.bubbleSortMethodAscending(arrayToSort));
    }

    @Test
    public void bubbleSortMethodDescending() {
        assertArrayEquals(resultDescending, tempBubbleSortObject.bubbleSortMethodDescending(arrayToSort));
    }
}