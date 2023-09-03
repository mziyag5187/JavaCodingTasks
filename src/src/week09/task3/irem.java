package src.week09.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class irem {

    /**
     * ArrayList - Remove some values
     * Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100, 200, 10, 20,40, 25,450, 120, 102, 36));

        list.removeIf(p -> p> 100);

        System.out.println(list);



        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(101,23,46,78,90,324,156));

        list2.removeIf(p -> p >100);
        System.out.println(list2);
    }
}
