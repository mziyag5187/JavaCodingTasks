package src.week09.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed_Anastasia {
  /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'

     */

    /**
     * Use remove all method to remove "Ahmed" from the array list
     * @param args
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        list.removeAll(Arrays.asList("Ahmed"));
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","David", "Owen", "Sam"));
        list1.removeAll(Arrays.asList("Ahmed"));
        System.out.println(list1);
    }
}
