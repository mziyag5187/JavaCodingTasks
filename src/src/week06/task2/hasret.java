package src.week06.task2;

public class hasret {
    /*
    Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */


    public static void main(String[] args) {

        int[] arr1 = {99, 12, 23, 32, 44, 57, 6};
        int[] arr2 = {12, 23, 32, 44, 57, 6};
        int[] arr3 = {120, 203, 32, 44, 57, 6};
        int[] arr4 = {9, 1, 23, 32, 44, 5700, 6};
        int[] arr5 = {23, 3200, 44, 57, 6};

        System.out.println("findMax(arr1) = " + findMax(arr1));
        System.out.println("findMax(arr2) = " + findMax(arr2));
        System.out.println("findMax(arr3) = " + findMax(arr3));
        System.out.println("findMax(arr4) = " + findMax(arr4));
        System.out.println("findMax(arr5) = " + findMax(arr5));


    }


    /**
     * This method will find maximum number in given array.
     * @param arr
     * @return
     */

    public static int findMax(int[] arr){


        int max = Integer.MIN_VALUE;

        for (int eachNumber : arr) {

            if(eachNumber > max){
                max = eachNumber;
            }
        }

        return max;


    }
}
