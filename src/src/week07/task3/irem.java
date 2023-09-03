package src.week07.task3;

import java.util.Arrays;

public class irem {
    public static void main(String[] args) {

        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(SortDescending(arr)));
    }


    /**
     * Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
     * param: arr
     * return: int[]
     */

    public static int[] SortDescending(int[] arr){

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {

                if(arr[i] < arr[j]){
                    num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
        return arr;
    }
}
/*
3️⃣ Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
 */