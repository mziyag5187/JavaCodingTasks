package src.week09.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValues_Anastasia {
      /*
    ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    /**
     * Using lambda expression remove  number if it is greater than 100
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 100, 210, 140, 10, 20, 20, 20));
        numbers.removeIf(p-> p>100);
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(10, 20, 30, 40, 50, 160, 700, 100, 210, 140));
        numbers2.removeIf(p-> p>100);
        System.out.println(numbers2);


    }
}
