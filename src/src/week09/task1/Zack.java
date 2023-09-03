package src.week09.task1;

import java.util.Arrays;

public class Zack {
    /*
     =====  Array -- Concat two arrays ========
        Write a return method that can concatenate two arrays
     */
    public static void main(String[] args) {
         int[] nums1 = {1,2,3,4};
         int[] nums2 = {5,6,7,8};

        int[] resultArr = concatTwoArrays(nums1, nums2);
        System.out.println("resultArr = " + Arrays.toString(resultArr));
    }

    /**
     * concatenates two given arrays
     * @param arr1 int array
     * @param arr2 int array
     * @return int array
     */
    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for(int each: arr1) {
            result[i] = each;
            i++;
        }
        for(int each: arr2) {
            result[i] =each;
            i++;
        }
        return result;
    }
}
