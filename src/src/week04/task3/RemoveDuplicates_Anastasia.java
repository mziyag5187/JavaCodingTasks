package src.week04.task3;

public class RemoveDuplicates_Anastasia {
    /*
    Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static String removeDup(String str){
        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            char each = str.charAt(i); // retrieves all the characters from the str
            if(!result.contains(""+each)){ // if result string doesn't contain character
                result += each; // add chracter to the result
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBVBCCDDD"));
        System.out.println(removeDup("BBHHBHBHBHBHOUOIUOUIYUYGTUYGKK"));
    }
}
