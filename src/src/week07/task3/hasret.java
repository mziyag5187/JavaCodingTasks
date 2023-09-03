package src.week07.task3;

import java.util.Arrays;

public class hasret {

    //Array_SortDescending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};


    public static void main(String[] args) {

        int[] arr = {10, 20, 7, 8, 90};

        System.out.println(Arrays.toString(sortDescending(arr)));


    }


    /**
     * This method will sort int array in descending order.
     *
     * @param array
     * @return
     */


    public static int[] sortDescending(int[] array) {

        // 10, 20, 7, 8, 90

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int number = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = number;

                }


            }

        }


        return array;

    }

}
