package src.week09.task1;

import java.util.Arrays;

public class Afshin {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {4,5,6};
        System.out.println(Arrays.toString(concat(num1, num2)));
    }

    public static int[] concat(int[] num1, int[] num2){
        int num3[] = new int[num1.length + num2.length];

        for (int i = 0; i < num1.length; i++) {
            num3[i] = num1[i];
        }

        for (int i = 0; i < num2.length; i++) {
            num3[num1.length+i] = num2[i];
        }

        return num3;
    }
}
/*
Array - Concat two arrays
  Write a return method that can concat two arrays
 */
