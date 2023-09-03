package src.week05.task2;

public class hasret {
     /*
    String -- Reverse
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "istanbul";

        reversedString(s1);
        reversedString(s2);

        System.out.println("------------------------------------");

        reverseWithBuilder(s1);
        reverseWithBuilder(s2);

    }

    /**
     * This method provides to reverse the string.
     *
     * @param str any string
     */

    public static void reversedString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }


        System.out.println(reversed);

    }


    /**
     * This method will reverse String with StringBuilder.
     * @param str
     */

    public static void reverseWithBuilder(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }


}