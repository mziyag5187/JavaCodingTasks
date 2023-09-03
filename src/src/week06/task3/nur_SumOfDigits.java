package src.week06.task3;

public class nur_SumOfDigits {
    public static void main(String[] args) {
        String str= "12 java 5 apple 3";
        System.out.println(sumOfDigit(str));

    }

    /**
     *  returns the sum of the digits in a String
     * @param str
     * @return int
     */
    public static int sumOfDigit(String str){

        String[] words= str.split(" "); //12,java,5,apple,3
        int result=0;

        for (int i = 0; i < words.length; i++) {
            String updated=words[i]; //12java
            for(int j=0 ; j< updated.length(); j++){
                char ch= updated.charAt(j);
                if(Character.isDigit(ch)) { //but what if it was 12app instead of 12, then if we skip the look at the end we can only get 1 , not 2
                    result += Integer.valueOf(updated); //valueOf can take int as parameter
                    break; //skip the loop, check next word
                }
            }

        }
        return result;

    }

}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */
