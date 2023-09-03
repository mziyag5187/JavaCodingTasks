package src.week07.task1;

public class Array_FindMinimum_Anastasia {

    /*
    Write a method that can fid the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

     */
public static int findMinimum(int[] arr){
   int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] < min){ // compares the elements of the array with the current minimum number
            min = arr[i]; // replaces current minimum number
        }
    }
    return min;
}

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("min = " + findMinimum(arr));




    }

}
