package algorithms.bubbleSort;

import static java.util.Arrays.sort;

public class BubbleSort extends Sorter implements Sortable{

    @Override
    public <T extends Comparable<T>> void sortAscending(T[] values) {
        sort02(values,0,1);
    }

    @Override
    public <T extends Comparable<T>> void sortDescending(T[] values) {
        sort02(values,1,0);
    }

    //Second attempt
    private <T extends Comparable<T>> void sort02(T[] values, int first, int second) {
        int length = values.length;
        int count = 0;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                count++;
                if (values[j + first].compareTo(values[j + second]) > 0) {
                    swap(values, j + first, j + second);
                }
            }
        }
    }

    //First attempt
    private <T extends Comparable<T>> void sort01(T[] values, int first, int second) {
        int length = values.length;
        int count = 0;
        for(int x = 0; x<length-1;){
            for(int y = 1; x<length-1;y++){
                if(values[x].compareTo(values[y])>0){
                    swap(values,x,y);
                }
                x++;
                count++;
            }
            x=0;
            count++;
            length--;
        }
    }
}
