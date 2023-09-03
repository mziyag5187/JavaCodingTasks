package src.week07.task3;

import java.util.Arrays;

public class Yana3 {

    /**
     * Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
     * Ex: int[] arr = {10,20,7, 8, 90};
     * arr = sortDescending(arr); ==> {90, 20, 10, 8, 7};

     */

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(sortDescending(arr));

    }
    public static String sortDescending(int[] array){


        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                int smallerNumber = 0; //for keeping changing value


                if (array[i] < array[j]) {

                    smallerNumber = array[i]; //10

                    array[i] = array[j]; //now we have {20,20,7,8,9,90}

                    array[j] = smallerNumber; //{20,10,7,8,9,90}

                }
            }
        }

        return Arrays.toString(array);

    }
}
