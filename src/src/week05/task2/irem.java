package src.week05.task2;

public class irem {
    public static void main(String[] args) {

        System.out.println(reverse("GOOD MORNING"));
        System.out.println(reverse("Hello everyone"));
    }

    /**
     * Write a function that can reverse a String
     * parameter str
     * return String
     */

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            char each = str.charAt(i);

            result += each;

        }

        return result;
    }
}
/*
  String -- Reverse
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */