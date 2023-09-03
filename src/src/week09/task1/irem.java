package src.week09.task1;

import java.util.Arrays;

public class irem {

    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60};
        int[] arr3 = concat(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

    }

    /**
     * Array - Concat two arrays. Write a return method that can concat two arrays.
     * @param array1
     * @param array2
     * @return
     */

public static int[] concat(int[] array1, int[] array2){

    int[] array3 = new int[array1.length + array2.length];

    int index = 0;

    for (int i = 0; i < array1.length; i++) {
        array3[index] = array1[i];
        index++;
    }

    for (int i = 0; i < array2.length; i++) {
        array3[index] = array2[i];
        index++;
    }

    return array3;
}
}
/*
 Array - Concat two arrays
  Write a return method that can concat two arrays.
 */