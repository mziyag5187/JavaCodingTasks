package src.week04.task2;

import java.util.Arrays;

public class irem {
    public static void main(String[] args) {

        System.out.println("sameLetters(\"abc\", \"bca\") = " + sameLetters("abc", "bca"));
        System.out.println("sameLetters(\"abcd\", \"bca\") = " + sameLetters("abcd", "bca"));
        System.out.println("sameLetters(\"asc\", \"klm\") = " + sameLetters("asclkm", "klm"));

    }

    /**
     * Write a return method that checks if a string is built out of the same letters as another string.
     * param str1, str2
     * return  boolean
     */

    public static boolean sameLetters(String str1, String str2) {

        String[] s1 = str1.split("");
        String[] s2 = str2.split("");

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1, s2)){
            return true;
        }else{
            return false;
        }



    }

}
/*
2️⃣  String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */