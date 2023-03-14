package algorithms.bubbleSort;

public abstract class Sorter {
    protected <T extends Comparable<T>> void swap(T[] values, int first, int second){
        T temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }
}
