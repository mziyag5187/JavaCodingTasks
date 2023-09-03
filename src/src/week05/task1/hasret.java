package src.week05.task1;

public class hasret {
     /*
    String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */





    public static void main(String[] args) {

        String s1 = "AAABBBCCCDEF";
        String s2 = "fevkalade";


        System.out.println("uniqueCharacters(s) = " + uniqueCharacters(s1));
        System.out.println("uniqueCharacters(s2) = " + uniqueCharacters(s2));


    }


    /**
     * This method provides to find a unique characters of string.
     * @param str any String
     * @return String type
     */

    public static String uniqueCharacters(String str) {


        String uniques = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                uniques += ch;
            }

        }

        return uniques;


    }

}