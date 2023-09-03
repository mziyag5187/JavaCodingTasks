package src.week06.task3;

import java.util.ArrayList;

public class Yana3{

    /**
     * Write a method that can return the sum of the digits in a String
     * Ex:  "12 java 5 apple 3"  ==>  20
     */

    public static void main(String[] args) {
        System.out.println(sumOfDigit("12 java 5 apple 3"));
    }

    public static int sumOfDigit(String str){
        
        char[] arr = str.toCharArray();
        ArrayList<Integer> numbers= new ArrayList<>();

        for (char each : arr) {
            if(Character.isDigit(each)){
                String longNum = "";
                for (int i = 0; i < arr.length-1; i++) {
                    if(Character.isDigit(arr[i+1])){
                        longNum+=arr[i+1];
                    }

                }
                Integer longInt = Integer.parseInt(longNum);

                numbers.add(Integer.parseInt(each+""));
                numbers.add(longInt);

            }
        }

        int result = 0;
        for (Integer each : numbers) {
            result+= each;
        }

        return  result;
        
    }
}
