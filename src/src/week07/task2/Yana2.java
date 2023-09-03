package src.week07.task2;

import java.util.Arrays;

public class Yana2 {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        System.out.println(sortAscending(arr));
    }

    /**
     * Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
     * Ex: int[] arr = {10, 9, 8, 7};
     * arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
     */


    public static String sortAscending(int[] array){


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                int biggerNumber = 0; //for keeping changing value


                if (array[i] > array[j]) { // 10 > 9

                    biggerNumber = array[i]; //bigger now is 10

                    array[i] = array[j]; //now we have {9,9,8,7}

                    array[j] = biggerNumber; // assigning the bigger one to second element, so now it is after smaller number
                    //now{9,10,8,7}
                }
            }
        }

    return Arrays.toString(array);

    }









    }

