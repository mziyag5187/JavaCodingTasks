package src.week05.task1;

public class irem {

    public static void main(String[] args) {

        System.out.println(unique("ABKKLLLSSMSNEPPPX"));
        System.out.println(unique("qollliiremmmas"));
    }

    /**
     * Write a return method that can find the unique characters from the String
     * parameter str
     * return String
     */


    public static String unique(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);  // a,a,b,b,b,

            if(str.indexOf(each) == str.lastIndexOf(each)){

                result += each;
            }

        }

        return result;

    }
}

/*
1️⃣  String - Find the unique
     Write a return method that can find the unique characters from the String
     Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */