package src.week07.task3;

import java.util.Arrays;

public class Nur_Array_Sort_Descending {
    public static void main(String[] args) {
         int[] arr= {10,20,8,90};
        System.out.println(Arrays.toString(descendingOrder(arr)));

    }
    public static int[] descendingOrder(int[] arr){


        for (int i = 0; i < arr.length; i++) { //10, i=1, 2

            for (int j = i+1; j < arr.length; j++) { //20, 8, j=2, 3

                int temp=0; //10

                if(arr[i] <arr[j]) { //10<20,10<90, 20<8, 8<90
                    temp = arr[i]; //10,90,               temp=8
                    arr[i] =arr[j]; //arr[0]= 20,90, arr[2]= 90
                    arr[j]=temp;//arr[3]=10, arr[3]= 8

                }

            }

        }
        return arr;

    }

}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDecending(arr); ==> {90, 20, 10, 8, 7};

 */
