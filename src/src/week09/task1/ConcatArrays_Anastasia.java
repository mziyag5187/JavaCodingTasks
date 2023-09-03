package src.week09.task1;

import java.util.Arrays;

public class ConcatArrays_Anastasia {
      /*
    Array - Concat two arrays
  Write a return method that can concate two arrays.
     */

    /**
     * USe 2 loops, loop1 goes through arr1 and adds all the numbers to arr3, loop2 goes through arr2 and adds all the numbers to arr3
     * @param arr1
     * @param arr2
     * @return
     */
    public static int[] concatArrays(int []arr1, int []arr2){

        int []arr3 = new int[arr1.length +arr2.length]; // it will give arr3 capacity of arr1 + arr2
        int a = 0; // for third array index number
        for (int i = 0; i < arr1.length ; i++, a++) {
            arr3[a] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,a++) {
            arr3[a] = arr2[i];
        }
        return arr3;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};
        int[] arr3 = concatArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        int [] r1 = {10,23};
        int[] r2 = {24,3,45,67};
        int[]r3 = concatArrays(r1,r2);
        System.out.println(Arrays.toString(r3));
    }
}
