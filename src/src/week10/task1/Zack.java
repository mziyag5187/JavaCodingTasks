package src.week10.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zack {
    /*
    ====== ArrayList - sorting in ascending ==============
    Write a method that can sort the ArrayList in Ascending order without
    using the sort method.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3,5,99,12,32,55));
        sortArrayListAsc(numbers);
    }

    /**
     * sorts a given ArrayList in ascending order without using the sort method.
     * @param list List<Integer>
     */
    public static void sortArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

}
