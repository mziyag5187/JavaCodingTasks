package src.week09.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Zack {
    /*
    ====== ArrayList - Remove some values ===========
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc.
        Remove all values greater than 100.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(11,43,677,84,99,101,112,334));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(11,43,677,84,99,101,112,334));
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(11,43,677,84,99,101,112,334));

        System.out.println("removeNumber_1(numbers) = " + removeNumber_1(numbers1));
        System.out.println("removeNumber_2(numbers) = " + removeNumber_2(numbers2));
        System.out.println("removeNumber_3(numbers) = " + removeNumber_3(numbers3));


    }

    // ============= SOLUTION 1 =============================
    /**
     * Removes all values greater than 100 from the given list
     * @param nums List of Integer
     * @return List of Integer
     */
    public static ArrayList<Integer> removeNumber_1(ArrayList<Integer> nums){

        ArrayList<Integer> numsResult = new ArrayList<>();

        for(int each : nums)
            if( each <= 100)
                numsResult.add(each);
        nums = numsResult;

        return nums;
    }


    // ============= SOLUTION 2 - Iterator =============================
    /**
     * Removes all values greater than 100 from the given list
     * @param nums List of Integer
     * @return List of Integer
     */
    public static ArrayList<Integer> removeNumber_2(ArrayList<Integer> nums){

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext())
            if(it.next()>100)
                it.remove();

        return nums;
    }

    // ============= SOLUTION 3 -removeIf() =============================
    /**
     * Removes all values greater than 100 from the given list
     * @param nums List of Integer
     * @return List of Integer
     */
    public static ArrayList<Integer> removeNumber_3(ArrayList<Integer> nums){

        nums.removeIf(p -> p>100);

        return nums;
    }


}
