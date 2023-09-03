package src.week10.task2;

import java.util.Arrays;

public class ArrayListDescending_nur {

    public static void main(String[] args) {
        int[] arr= {2,345,6,456,4,5,1};
        System.out.println(Arrays.toString(descending(arr)));

    }
    public static int[] descending(int... arr ){


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] <arr[j+1]){ //2<345, 2<6
                    int temp= arr[j]; //2,
                    arr[j]= arr[j+1];// arr[0]= 345
                    arr[j+1]= temp; //arr[1]=2


                }
            }

        }
        return arr;

    }
}
