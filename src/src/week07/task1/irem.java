package src.week07.task1;

public class irem {

    public static void main(String[] args) {

        int[] numbers = {200,300, 400,100,800,10};
        System.out.println(MinNumber(numbers));

        int[] array = {99, 12, 23, 32, 44, 57, 16};
        System.out.println(MinNumber(array));
    }

    /**
     * Write a method that can find the minimum number from an int Array
     * param: arr
     * return: int
     */

    public static int MinNumber(int[] arr){

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
/*

1️⃣  Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */