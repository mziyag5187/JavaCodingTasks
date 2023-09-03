package src.week05.task1;

public class Yana1 {

    /**
     * Write a return method that can find the unique characters from the String
     *  Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {
        System.out.println(unique("aaaabbbbdddeeeghtssss"));
    }
    public static String unique(String str){

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);

            int frequency = 0; // reset the frequency

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {//checks each character and compares with ch
                    frequency++;
                }
            }

            if(frequency==1){
                result+=ch;
            }
        }


       return result;

    }
}
