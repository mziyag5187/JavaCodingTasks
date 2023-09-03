package src.week09.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class irem {

    /**
     *  ArrayList - Remove "Ahmed"
     *   Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
     *   Write a java operation to remove all the names named 'Ahmed'
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "Mert", "Baris", "John", "Ahmed", "Melih", "Eric"));

        list.removeIf(p -> p.equals("Ahmed"));

        System.out.println(list);
    }



}
