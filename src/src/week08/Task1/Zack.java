package src.week08.Task1;

import java.util.Arrays;

public class Zack {
    /*
    ======= Array - N unique integers that sum up to 0 ============
        Write a function that, given an integer N (1 < N < 100), returns an array
        containing N unique integers that sum up to 0. The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3, 2] or [-2, 1, -4, 5].
         The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
         For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
     */

    public static void main(String[] args) {
        System.out.println("solution(6) = " + Arrays.toString(solution(6)));
    }

    /**
     * returns an array containing N unique integers that sum up to 0
     * @param N number of the int values in the result array
     * @return int array
     */
    public static int[] solution(int N){
        int[] result = new int[N]; //4
        int sum = 0;
        for(int i=0; i < N-1; i++) { // 0, 1, 2
            result[i] =i; // [0, 1, 2, -3]
            sum += i; // 3
        }
        result[N-1] = -sum; //3
        return result;
    }

}
