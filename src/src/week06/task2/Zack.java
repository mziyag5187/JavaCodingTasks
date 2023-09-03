package src.week06.task2;

import java.util.Arrays;

public class Zack {
    /*
    =========  Array_FindMaximum ===========================================
        Write a method that can find the maximum number from an int Array
            Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static void main(String[] args) {
        int[] arr = {11, 12, 23, 187, 44, 57, 6};// ==> 99
        System.out.println("maxValue(arr) = " + maxValue_1(arr));
        System.out.println("maxValue_2(arr) = " + maxValue_2(arr));
    }

    // ============= SOLUTION 1 =============================
    /**
     * finds the maximum number from an int Array
     * @param arr - an int Array
     * @return maxValue - the biggest number in the given Array
     */

    public static int maxValue_1( int[]  arr ) {
        int max = Integer.MIN_VALUE;
        for(int each: arr)
            if(each > max)
                max = each;

        return max;
    }

    // ============= SOLUTION 2 =============================
    /**
     * finds the maximum number from an int Array
     * @param arr - an int Array
     * @return maxValue - the biggest number in the given Array
     */
    public static int maxValue_2( int[]  arr ) {
        Arrays.sort( arr );
        return  arr[ arr.length-1 ];
    }


}
