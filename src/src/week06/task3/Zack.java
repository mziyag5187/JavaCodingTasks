package src.week06.task3;

public class Zack {
    /*
    ========  String_SumOfAllDigits  =======================
      Write a method that can return the sum of the digits in a String
            Ex:  "12 java 5 apple 3"  ==>  11
     */
    public static void main(String[] args) {
        System.out.println("sumOfDigits(\"12 java 5 apple 3\") = " + sumOfDigits("12 java 5 apple 3"));//20
    }

    /**
     * returns the sum of the digits in a given String
     * @param s - String value
     * @return int - total value
     */
    public  static int sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }

}
