package src.week07.task2;

import java.util.Arrays;

public class Nur_Array_SortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(ascendingOrder(arr)));
    }

    public static int[] ascendingOrder(int[] arr){

        int[] arr2= new int[arr.length];


        for(int i =0; i<arr.length; i++){ //10,

            for(int j=i+1; j<arr.length; j++){ //9
                int temp=0;
               if(arr[i]> arr[j]){  //10>9
                   temp= arr[i]; //temp: 10
                   arr[i]=arr[j]; // arr[0]= 9
                   arr[j]= temp; // arr[1]=10
               }



            }
        }
        return arr;

    }

}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */
