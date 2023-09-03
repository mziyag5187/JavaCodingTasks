package src.week04.task1;

public class hasret {

    /*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

    public static void main(String[] args) {


        System.out.println("frequencyOfChars(\"aaaaabddddc\") = " + frequencyOfChars("aaaaabddddc"));
        System.out.println("frequencyOfChars(\"aaaaajjjjjjjjkkkkkkl\") = " + frequencyOfChars("aaaaajjjjjjjjkkkkkkl"));


    }

    /**
     * Finding frequency of letters
     * @param str
     * @return
     */

    public static String frequencyOfChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

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


        return result;


    }


}
