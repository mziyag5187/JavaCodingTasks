package src.week09.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Afshin {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Michael", "Michelle", "Vanessa"));

        for (int i = 0; i < names.size(); i++) {
            if((names.get(i)).equalsIgnoreCase("Ahmed")){
                names.remove(i);
            }
        }
        System.out.println(names);
    }
}
/*
 ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
 */