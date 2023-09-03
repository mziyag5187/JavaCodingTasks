package src.week08.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Afshin {
    public static void main(String[] args) {
        int number = 4;
        System.out.println(Arrays.toString(arrayGenerator(number)));
    }
    /*
    public static int[] arrayGenerator(int number) {
        int[] nums = new int[number];

        for (int i = 0; i < nums.length - 1; i++) {
            int randomNumber = LocalDateTime.now().getSecond();
            String randomNumberS = "" + randomNumber;
            if (randomNumberS.length() == 2) {
                randomNumber = Integer.parseInt("" + randomNumberS.charAt(1));
            } else {
                randomNumber = Integer.parseInt("" + randomNumberS);
            }
            int randomNumberSign = LocalDateTime.now().getSecond();
            if (randomNumberSign % 2 == 0) {
                randomNumber *= -1;
            }
            try {
                Thread.sleep(1369);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            nums[i] = randomNumber;
        }
        int numAdded = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            numAdded += nums[i];
        }
        nums[nums.length - 1] = numAdded*(-1);

        return nums; //
    }*/
    public static int[] arrayGenerator(int number) {
        ArrayList numberSet = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            numberSet.add(i);
        }
        int[] nums = new int[number];
        int randomNumber = 1;

        for (int i = 0; i < number-1; i++) {
            Collections.shuffle(numberSet);
            for (int j = 0; j < numberSet.size(); j++) {
                if ((int) numberSet.get(j) == 8) {
                    randomNumber = j;
                }
                if ((int) numberSet.get(j) == 3) {
                    if(j%2==0){
                        randomNumber = j*(-1);
                    }
                }
                nums[i] = randomNumber;
            }
        }
        int numAdded = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            numAdded += nums[i];
        }
        nums[nums.length - 1] = numAdded*(-1);
        return nums;
    }
}
/*
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers
that sum up to 0. The function can return any such array. For example, given N = 4, the function could
return [1,0, -3, 2] or [-2, 1, -4, 5]. The answer [1, -1, 1, 3] would be incorrect (because value 1
occurs twice). For N = 3 one of the possible answers is [-1, 0, 1] (but there are many more answers)
 */

