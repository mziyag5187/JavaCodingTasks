package src.week04.task1;

public class FrequencyOfChars_Anastasia {

    /*
    Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */

    public static String frequencyOfChars(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // each character of the string
            int count = 0;
            for (int j = 0; j < str.length() ; j++) { // compares each ch to each character of the str and return frequency of ch
                char each = str.charAt(j);
                if(ch==each){
                    count ++;
                }
            }
            if(result.contains(""+ ch)){
                continue;
            }
            result += ch;
            result += count;
        }
        return  result;
    }


    public static void main(String[] args) {
         System.out.println(frequencyOfChars("AABBBCDD"));

    }

}
