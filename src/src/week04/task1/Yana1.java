package src.week04.task1;

public class Yana1 {


    public static void main(String[] args) {

        /**
         *
         * Write a return method that can find the frequency of characters
         * ex. frequencyOfChars("AAABBCDD")==> A3B2C1D2
         *  */

        frequencyOfChars("AAAsssssssBBCDDD");
    }

    public static void frequencyOfChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }

            result += ch + "" + count;
        }



        System.out.println(result);
    }
}



