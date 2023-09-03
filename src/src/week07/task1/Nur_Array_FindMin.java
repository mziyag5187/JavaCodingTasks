package src.week07.task1;

public class Nur_Array_FindMin {

    public static void main(String[] args) {
        int[] arr= {99, 12, 23, 32, 44, 57, 6};

        System.out.println(minimumNum(arr));
    }

    public static int minimumNum(int[] arr){

        int minimum= arr[0];

        for(Integer min : arr) {

            if(min <minimum){
                minimum=min;
            }
        }
        return minimum;

    }

}
/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

 */
