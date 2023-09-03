package src.week05.task2;

public class StringReverse_Anastasia {
    /*
    Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
     */

    /**
     * String reverse using loop
     * @param str
     * @return string
     */
    public static String reverse(String str){
        String reverse = "";
         for (int i=str.length()-1; i >=0; i--){
             reverse += str.charAt(i);
         }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Nastia"));
        System.out.println(reverse("Liana"));

    }

}
