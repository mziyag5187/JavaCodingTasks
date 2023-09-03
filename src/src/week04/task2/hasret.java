package src.week04.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class hasret {

    /*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */


    public static void main(String[] args) {

        System.out.println(hasSameLetter("has", "sah"));
        System.out.println(hasSameLetter("ha", "ho"));
        System.out.println(hasSameLetter("123", "321"));
        System.out.println(hasSameLetter("purusa", "asurup"));
        System.out.println(hasSameLetter("hello", "answer"));

    }

    /**
     * Checking String has same letter or not
     * @param str1
     * @param str2
     * @return
     */

    public static boolean hasSameLetter(String str1, String str2) {

        ArrayList<String> first = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> second = new ArrayList<>(Arrays.asList(str2.split("")));


        Collections.sort(first);
        Collections.sort(second);

        return first.equals(second);


    }


}
