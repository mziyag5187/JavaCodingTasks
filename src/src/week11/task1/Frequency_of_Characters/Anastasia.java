package src.week11.task1.Frequency_of_Characters;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Anastasia {

    /*
    Write a method that prints the frequency of each character from a String.
     */

    public static Map<String, Integer> frequencyOfCharacters(String str){
        Map<String,Integer> map = new LinkedHashMap<>();//we need to have insertion order
        for(String each : str.split("")){
            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);
            map.put(each,frequency);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("aabbbssrvrgtggggg"));
        System.out.println(frequencyOfCharacters("javajavajavajavatiredofjava"));
    }

}
