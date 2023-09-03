package src.week09.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Afshin {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 101, 65, 100, 230, 45, 999, 99, 1));
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > 100){
                nums.remove(i);
            }
        }
        System.out.println(nums);
    }
}
/*
ArrayList - Remove some values
  Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */