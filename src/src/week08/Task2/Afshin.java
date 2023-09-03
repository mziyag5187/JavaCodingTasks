package src.week08.Task2;

import java.util.Arrays;

public class Afshin {
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(zerosNotHeroes(nums)));
    }
    public static int[] zerosNotHeroes(int[] nums){

        for (int i = 0; i < nums.length; i++) { 
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
        return nums;
    }
}
/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1,2,3,4,0,0,0,0]
 */

