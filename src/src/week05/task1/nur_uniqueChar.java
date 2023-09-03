package src.week05.task1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class nur_uniqueChar {
    public static void main(String[] args) {
        System.out.println(unique("AAAASSSSAIH"));

    }

    public static String unique(String str){
       /*
       String newStr="";

       for(Character each : str.toCharArray()){
           if(!(newStr.contains(each+""))){
               newStr+=each;
           }
       }
       return newStr;

        */
        Set<String> linked= new LinkedHashSet<>();
        linked.addAll(Arrays.asList(str.split("")));
        return linked.toString().replace("[","").replace("]", "").replaceAll(", ","");


    }

}
