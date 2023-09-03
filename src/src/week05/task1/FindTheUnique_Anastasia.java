package src.week05.task1;

public class FindTheUnique_Anastasia {

    /*
    Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
 public static String uniqueElements(String str) {
     String result = "";
     for (int i = 0; i < str.length(); i++) {
         int n = 0; // number of non-repeating character
         for (int j = 0; j < str.length(); j++) {
             if (str.charAt(i) == str.charAt(j) && i != j) { // checking if two characters are equal
                 n = 1;
                 break;
             }
         }
         if (n == 0) {
             result += ""+str.charAt(i);
         }
     }
     return result;
 }




    public static void main(String[] args) {
        System.out.println(uniqueElements("AAABBBCCCDEF"));
        System.out.println(uniqueElements("BBEEEEEEKKKDOFOFKLFNDLELELELELEEEZ"));

    }
}
