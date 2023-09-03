package src.week07.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Zack {
    /*
    ======== Array_SortAscending =============
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
            Ex: int[] arr = {10, 9, 8, 7};
            arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 1, 33, 2, 4};
        System.out.println("sortingArrayAsc_1(arr) = " + Arrays.toString( sortingArrayAsc_1(arr)));
        System.out.println("sortingArrayAsc_2(arr) = " + Arrays.toString( sortingArrayAsc_2(arr)));
    }

    // ============= SOLUTION 1 =============================
    /**
     * sorts an int array in Ascending order without using the sort() method of the Arrays class
     * @param a int array
     * @return int array
     */
    public static int[] sortingArrayAsc_1(int[] a) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int each: a)
            list.add(each);

        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }

    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }

    // ============= SOLUTION 2 =============================
    /**
     * sorts an int array in Ascending order without using the sort() method of the Arrays class
     * @param a int array
     * @return int array
     */
    public static int[] sortingArrayAsc_2(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for(int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }



}
