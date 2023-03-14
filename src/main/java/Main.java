import algorithms.bubbleSort.BubbleSort;
import algorithms.bubbleSort.Sortable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Buuble sort");
        run();
    }

    //App config
    public static void run(){
        sort(new Integer[] { 1, 2, 3, 4, 5 ,7,8,10,9});
        sort(new Integer[] { 3, 1, 5, 4, 2, -1,-2 });
        sort(new Integer[] { 5, 4, 3, 2, 1 });
    }

    private static <T extends Comparable<T>> void sort(T[] values){
        Sortable sorter = new BubbleSort();
        sorter.sortAscending(values);
        sorter.sortDescending(values);
        System.out.println(Arrays.toString(values));
    }
}
