package src.week04.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Yana2 {

    public static void main(String[] args) {


        System.out.println(sameLetters("abccccaab", "acbaaacccb"));
        System.out.println(sameLetters("a", "aaaaaaa"));
        System.out.println(sameLetters("abc", "acb"));
    }


    /**
     * checks if strings built using same letters
     * @param a
     * @param b
     * @return
     */
    public static boolean sameLetters(String a, String b){

        ArrayList<Character> noDuplicatesList1 = new ArrayList<>();
        ArrayList<Character> noDuplicatesList2 = new ArrayList<>();


        char[] array1 = a.toCharArray();

        for (int i = 0; i < array1.length; i++) {
            if(!(noDuplicatesList1.contains(array1[i]))){
                noDuplicatesList1.add(array1[i]);
            }
        }

        char[] array2 = b.toCharArray();

        for (int i = 0; i < array2.length; i++) {
            if(!(noDuplicatesList2.contains(array2[i]))){
                noDuplicatesList2.add(array2[i]);
            }
        }


        Collections.sort(noDuplicatesList1);
        Collections.sort(noDuplicatesList2);

        if(noDuplicatesList1.equals(noDuplicatesList2)){
            return true;
        }else {
            return false;
        }



    }



}
