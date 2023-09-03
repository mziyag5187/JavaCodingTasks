package src.week04.task3;

public class hasret {
    /*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */


    public static void main(String[] args) {

        removeDuplicated("AGAGGGTS");
        removeDuplicated("HHHHHHAAAAAAAASSSSSRRRRREEEEETTTTTTTTT");
        removeDuplicated("3333333344444");


    }

    /**
     * This method will remove duplicated element from String.
     *
     * @param str
     * @return
     */


    public static String removeDuplicated(String str) {

        String result = "";

        for (String each : str.split("")) {
            if (!result.contains(each)) {
                result += each;
            }
        }

        System.out.println(result);


        return result;


    }
}
