package src.week07.task1;

import java.util.Arrays;

public class Zack {
    /*
    ========== Array_FindMinimum ==========================
      Write a method that can find the minimum number from an int Array
          Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static void main(String[] args) {
        int[] array = {99, 12, 23, 32, 44, 57, 66};
        System.out.println("maxValue_1(array) = " + maxValue_1(array));//6
        System.out.println("maxValue_2(array) = " + maxValue_2(array));//6
    }

    // ============= SOLUTION 1 =============================
    /**
     * returns the minimum number from a given int Array
     * @param arr int array
     * @return int
     */
    public static int maxValue_1( int[]  arr ) {
        int min = Integer.MAX_VALUE;
        for(int each: arr)
            if(each < min)
                min = each;

        return min;
    }

    // ============= SOLUTION 2 =============================
    /**
     * returns the minimum number from a given int Array
     * @param arr int array
     * @return int
     */
    public static int maxValue_2( int[]  arr) {
        Arrays.sort( arr );
        return  arr [ 0 ];
    }

}
