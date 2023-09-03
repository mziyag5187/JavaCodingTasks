package src.week11.task2.Map_Min_Value;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Anastasia {
    /*
    Write a method that can return the minimum value from a map (DO NOT use sort method).
     */
public static Integer minimumValue(Map<String,Integer> map){
    Integer min = Collections.min(map.values());
    return min;
}

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("k1",3);
        map.put("k2",2);
        map.put("k3",1);
        map.put("k4",6);
        map.put("k5",5);
        System.out.println(minimumValue(map));

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("k1",30);
        map2.put("k2",24);
        map2.put("k3",13);
        map2.put("k4",67);
        map2.put("k5",58);
        System.out.println(minimumValue(map2));

    }

}
