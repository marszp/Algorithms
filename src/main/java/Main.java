import oldMethodsNotIncludedOnGit.BubbleSort;
import algorithms.bubbleSort.BubbleSortAlgorithm;
import oldMethodsNotIncludedOnGit.Sortable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        run();
    }


    public static void run() {
        int[] arrayToSort = {-1, 4, -3, 2, 51};
        System.out.println(Arrays.toString(arrayToSort));
        BubbleSortAlgorithm buubleSortObjecct = new BubbleSortAlgorithm();
        System.out.println(Arrays.toString(buubleSortObjecct.bubbleSortMethodAscending(arrayToSort)));
        System.out.println("Now Descending");
        System.out.println(Arrays.toString(buubleSortObjecct.bubbleSortMethodDescending(arrayToSort)));
    }

}
