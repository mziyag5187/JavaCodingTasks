package src.week07.task3;

import java.util.Arrays;

public class SortDescending_Anastasia {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};
     */
public static int[] sortDescending( int[]arr){
    int temp = 0; // initialize int temp to store temp num
    for (int i = 0; i < arr.length; i++) { // outer loop is used to iterate the array until the length of the array
        for (int j = i+1; j < arr.length; j++) { // inner loop is to check the condition and swap the elements if the 1st element is less than the 2nd
            if(arr[i] < arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
    }
    return arr;

}

    public static void main(String[] args) {
        int[] arr = {10, 90, 8, 7,30};
        int[] arr1 ={20,40,10,60,1,2,8,6,5};
        System.out.println(Arrays.toString(sortDescending(arr)));
        System.out.println(Arrays.toString(sortDescending(arr1)));
    }

}
