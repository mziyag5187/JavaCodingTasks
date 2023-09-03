package src.week08.Task2;

import java.util.Arrays;

public class Zack {
    /*
    ===== Array - Move Zeros to the End =================
        Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
            Ex:
                input:  {1,0,2,0,3,0,4,0};
                output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static void main(String[] args) {
        int[] numArr1 = {1,0,2,0,3,0,4,0};
        int[] numArr2 = {1,0,2,0,3,0,4,0};

        System.out.println("Arrays.toString(moveZerosToEnd_1(numArr1)) = " + Arrays.toString(moveZerosToEnd_1(numArr1)));
        System.out.println("Arrays.toString(moveZerosToEnd_2(numArr2)) = " + Arrays.toString(moveZerosToEnd_2(numArr2)));

    }

    // ============= SOLUTION 1 - by utilizing from the Array general structure =============================
    /**
     * moves all zeros to the end of the given array
     * @param arr int array
     * @return int array
     */
    public static int[] moveZerosToEnd_1( int[] arr ) {

        int[] result = new int[arr.length];

        int i = 0;

        for(int each : arr){

            if(each != 0){
                result[i++] = each;
            }

        }

        return result;
    }



    // ============= SOLUTION 2 - by using two different iterator variable at the same time =============================
    /**
     * moves all zeros to the end of the given array
     * @param arr int array
     * @return int array
     */
    public static int[] moveZerosToEnd_2( int[] arr ) {

        int[] newArray = new int[arr.length];

        int begin = 0;
        int end = arr.length - 1;

        for(int number : arr){

            if(number == 0){
                newArray[end--] = number;
            }else {
                newArray[begin++] = number;
            }

        }
        return newArray;
    }

}
