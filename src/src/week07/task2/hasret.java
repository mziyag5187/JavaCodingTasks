package src.week07.task2;

import java.util.Arrays;

public class hasret {

    //Array_SortAscending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = sortAscending(arr); ==>{ 7, 8, 9, 10};

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(sortAscending(arr)));


    }


    /**
     * This method will sort int array in ascending order.
     *
     * @param array
     * @return
     */

    public static int[] sortAscending(int[] array) {

        // 10, 9 , 8, 7


        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {


                if (array[j] > array[j + 1]) {
                    int number = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = number;
                }

            }

        }

        return array;


    }


}



