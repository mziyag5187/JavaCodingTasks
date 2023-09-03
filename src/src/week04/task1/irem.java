package src.week04.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class irem {
    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("ABCDEABBB"));
        System.out.println(frequencyOfCharacters("sscccvsaaccvas"));

    }

    /**
     * Write a return method that can find the frequency of characters
     * parameter  str
     * return  String
     */

    public static String frequencyOfCharacters(String str){

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    frequency++;
                }
            }

            if(result.contains(""+ ch)){     // if the character is already included, skip this character
                continue;
            }

            result += ch + "" + frequency;

        }

        return result;


    }

    /**
     * second solution with Map
     */

    public static String frequencyOfChar(String str){

        String result = "";

        Map<String, Integer> map = new LinkedHashMap<>();

        for(String each : str.split("")){

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            map.put(each, frequency);
        }

        return result;
    }
}


