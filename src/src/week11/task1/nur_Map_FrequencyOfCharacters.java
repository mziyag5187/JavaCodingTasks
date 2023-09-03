package src.week11.task1;

import java.util.LinkedHashMap;
import java.util.Map;

public class nur_Map_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(freq("banana apple pie"));
    }

    public static Map<Character, Integer> freq(String word) {

        Map<Character, Integer> match = new LinkedHashMap<>();

        for(int i=0; i< word.length(); i++) {
            char ch = word.charAt(i);
            if (!match.containsKey(ch)) {
                match.put(ch, 0);
            }
            match.put(ch, match.get(ch) + 1);
        }
        return match;
        }



    }



/*
Write a method that prints the frequency of each character from a String.
 */