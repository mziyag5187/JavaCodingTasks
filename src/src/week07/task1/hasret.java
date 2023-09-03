package src.week07.task1;

public class hasret {
    //Array_FindMinimum
    //Write a method that can find the minimum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6


    public static void main(String[] args) {

        int[] arr1 = {99, 12, 23, 32, 44, 57, 6};
        int[] arr2 = {-99, 12, 23, 32, 44, 57, 6};

        findMin(arr1);
        findMin(arr2);


    }


    /**
     * This method finds minimum number from an int Array
     *
     * @param array
     */


    public static void findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int each : array) {
            if (each < min) {
                min = each;
            }
        }

        System.out.println(min);


    }
}
