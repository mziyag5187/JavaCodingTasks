package src.week05.task2;

public class nur_reverse {
    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));

    }

    public static String reverse(String str){
        String reversedStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr+= str.charAt(i);
        }
        return reversedStr;
    }

}
/*
Write a function that can reverse a String
 Ex: Reverse("ABCD"); ==> DCBA
 */
