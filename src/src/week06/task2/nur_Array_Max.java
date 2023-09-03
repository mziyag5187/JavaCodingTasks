package src.week06.task2;

public class nur_Array_Max {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(num(arr));

    }

    /**
     * finds max value from array
     * @param arr
     * @return int
     */
    public static int num(int[] arr){

        int max=0;

        for (int i = 0; i < arr.length; i++) {
            max=arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>max){
                    max= arr[j];
                }
            }

        }
        return max;









    }


}

/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
