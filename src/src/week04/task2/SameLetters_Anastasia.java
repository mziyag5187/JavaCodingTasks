package src.week04.task2;

import java.util.Arrays;

public class SameLetters_Anastasia {

    /*
    Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
     */
    public static boolean sameLetters(String str1, String str2) {
        String[] s1 = str1.split("");
        String[] s2 = str2.split("");
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("cat","tac"));
        System.out.println(sameLetters("dog","pig"));

    }
}