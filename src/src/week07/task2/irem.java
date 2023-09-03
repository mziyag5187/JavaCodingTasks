package src.week07.task2;

import java.util.Arrays;

public class irem {

    public static void main(String[] args) {
        int[] array = {10,20,12,3,25,18};
        System.out.println(Arrays.toString(sortAscending(array)));

        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortAscending(arr)));

    }


    /**
     * Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
     * param: arr
     * return: int[]
     */

    public static int[] sortAscending(int[] arr){

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {

                if(arr[i] > arr[j]){
                    num = arr[i];        // swap the elements
                    arr[i] = arr[j];
                    arr[j] = num;

                }
            }
            }

        return arr;
        }

        }



/*
 Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */