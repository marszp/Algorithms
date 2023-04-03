package algorithms.bubbleSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortAlgorithmTest {

    private int[] arrayToSort = {-1, 4, -3, 2, 51};
    private int[] resultAscending = {-3, -1, 2, 4, 51};
    private int[] resultDescending = {51, 4, 2, -1, -3};
    private BubbleSortAlgorithm tempBubbleSortObject = new BubbleSortAlgorithm();

    @Test
    public void shouldBubbleSortBeNullObject() {
        assertTrue(tempBubbleSortObject.equals(null));
    }

    @Test
    public void shouldBubbleSortMethodAscending() {
        assertArrayEquals(resultAscending, tempBubbleSortObject.bubbleSortMethodAscending(arrayToSort));
    }

    @Test
    public void shouldBubbleSortMethodDescending() {
        assertArrayEquals(resultDescending, tempBubbleSortObject.bubbleSortMethodDescending(arrayToSort));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBubbleSortThrowIllegalArgumentExceptionAtMethodAscending(){
        tempBubbleSortObject.bubbleSortMethodAscending(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldBubbleSortThrowIllegalArgumentExceptionAtMethodDescending(){
        tempBubbleSortObject.bubbleSortMethodDescending(null);
    }
}