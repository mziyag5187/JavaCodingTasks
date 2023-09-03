package src.week11.task2;

import java.util.*;

public class nur_Map_minValue {
    public static void main(String[] args) {
        Map<Object, Integer> num= new HashMap<>();
        num.put("key1",100);
        num.put("key2",200);
        num.put("key3",300);
        num.put("key4",400);


        List<Integer> order= new ArrayList<>();

        for(Map.Entry<Object, Integer> each: num.entrySet()){
            order.add(each.getValue());

        }
        int numMin= Collections.min(order);

        System.out.println(numMin);


    }


}
/*
Write a method that can return
 the minimum value from a map (DO NOT use sort method).
 Map<String, Integer> map = Map.of("key1", 100, "key2", 200, "key3", 300);
 */