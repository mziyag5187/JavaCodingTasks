package src.week07.task1;



public class Yana1 {

    /**
     *Write a method that can find the minimum number from an int Array
     * Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,0};

        System.out.println(minNumber(array));
    }

    public static int minNumber(int[] array){

        int min = array[0];

        for (int each : array) {
            if(each<min){
                min = each;
            }
        }

        return min;
    }



}
