package src.week11.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Zack {
    /*
    =====  Map_Frequency of Characters ==========
        Write a method that prints the frequency of each character
        from a String.
     */

    public static void main(String[] args) {
        frequencyTest("ZackZackZZZZaaa");
    }

    /**
     * prints the frequency of each character inside the given String
     * @param str
     */
    public static void frequencyTest(String  str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }

}
