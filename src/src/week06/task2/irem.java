package src.week06.task2;

public class irem {

    public static void main(String[] args) {
        int[] numbers = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(maxNumber(numbers));

        int[] numbers2 = {120, 125, 230, 132, 444, 157, 906};
        System.out.println(maxNumber(numbers2));
    }

    /**
     * Write a method that can find the maximum number from an int Array
     * @param arr
     * @return int
     */

    public static int maxNumber(int[] arr){

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            
            max = arr[i];

            for (int j = 0; j < arr.length; j++) {

                if(arr[j] > max){
                    max = arr[j];
                }
            }
        }
        return max;
    }

}
/*
2️⃣  Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */