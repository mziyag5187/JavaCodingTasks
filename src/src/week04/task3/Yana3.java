package src.week04.task3;

public class Yana3 {

    public static void main(String[] args) {
        /**
         * Write a return method that can remove the duplicated values from the String
         *   Ex: removeDup("AAABBBCCC") ==> ABC
         */

        System.out.println(removeDup("AAAAABBBBCCdddd"));
    }

/**
 * returns string without duplicates
 * @param str
 */

    public static String removeDup(String str){
        String result = "";

        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {

            if(!(result.contains(array[i]+""))){
                result += array[i]+"";
            }
        }
        return result;
    }
}
