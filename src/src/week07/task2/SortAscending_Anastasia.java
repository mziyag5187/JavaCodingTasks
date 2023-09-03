package src.week07.task2;

import java.util.Arrays;

public class SortAscending_Anastasia {

    /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
     */
    
    public static int[] sortAscending( int[] arr){

        int temp = 0; // initialize int temp to store temp num
        for (int i = 0; i < arr.length; i++) { // outer loop is used to iterate the array until the length of the array
            for (int j = i+1; j < arr.length; j++) { // inner loop is to check the condition and swap the elements if the 1st element is less than the 2nd
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
     return arr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        int[] arr1 ={20,40,10,60,1,2,8,6,5};
        System.out.println(Arrays.toString(sortAscending(arr)));
        System.out.println(Arrays.toString(sortAscending(arr1)));
    }
    
    
}
