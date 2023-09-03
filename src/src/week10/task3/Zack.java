package src.week10.task3;

import java.util.*;

public class Zack {
    /*
    ===== Map - Sort the map by values =========
    Write a method that can sort the Map by values.
     */
    public static void main(String[] args) {
       Map<String,Integer> studentNoList = new HashMap<>();
       studentNoList.put("Aysun",120);
       studentNoList.put("Adam",130);
       studentNoList.put("Jamal",100);

        System.out.println("sortMapByValue(studentNoList) = " + sortMapByValue(studentNoList));
    }

    /**
     * sorts the  Map by values
     * @param map => Map<String, Integer>
     * @return Map<String, Integer>
     */
    public static Map<String, Integer> sortMapByValue(Map<String, Integer> map){


        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap();
        for(Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }

}
