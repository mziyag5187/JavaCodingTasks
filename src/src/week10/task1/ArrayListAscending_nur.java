package src.week10.task1;

import java.util.Arrays;

public class ArrayListAscending_nur {


    public static void main(String[] args) {
        int[] arr= {2,345,6,456,4,5,1};
        System.out.println(Arrays.toString(ascending(arr)));


    }
    public static int[] ascending(int... arr ){


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] >arr[j+1]){ //2<345, 2<6
                    int temp= arr[j]; //2,
                    arr[j]= arr[j+1];// arr[0]= 345
                    arr[j+1]= temp; //arr[1]=2


                }
            }

        }
        return arr;

    }

}


/*
ArrayList - sorting in ascending
  Write a method that can sort the ArrayList in Ascending order without using
the sort method.

 */