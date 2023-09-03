package src.week11.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Zack {
    /*
    ======= Map_Min value =============
        Write a method that can return the minimum
        value from a map (DO NOT use sort method).
     */
    public static void main(String[] args) {
        Map<String,Integer> quizGrades = new HashMap<>();
        quizGrades.put("student1",90);
        quizGrades.put("student2",45);
        quizGrades.put("student3",100);
        quizGrades.put("student4",50);

        System.out.println("minValueFromMap(quizGrades) = " + minValueFromMap(quizGrades));

    }

    /**
     * returns the minimum value from a map
     * @param map object as Map<String,Integer>
     * @return Integer as minimum value
     */
    public  static  int  minValueFromMap( Map<String,Integer> map  ) {
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first( );
    }

}
