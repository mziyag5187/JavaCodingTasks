package src.week09.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Zack {
    /*
    ======= ArrayList - Remove "Ahmed" ================
        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric","Ahmed","Eric","John"));

        System.out.println("removeName_1(\"Ahmed\") = " + removeName_1(names,"Ahmed"));
        System.out.println("removeName_2(\"Ahmed\") = " + removeName_2(names,"Eric"));
        System.out.println("removeName_3(\"Ahmed\") = " + removeName_3(names,"John"));

    }

    // ============= SOLUTION 1 - removeAll() =============================

    /**
     * removes all the names given as parameter
     * @param names List of String
     * @param name String
     * @return List of String
     */
    public static ArrayList<String> removeName_1(ArrayList<String> names, String name){
        names.removeAll( Arrays.asList(name));
        return names;
    }

    // ============= SOLUTION 2 - Iterator object =============================

    /**
     * removes all the names given as parameter
     * @param names List of String
     * @param name String
     * @return List of String
     */
    public static ArrayList<String> removeName_2(ArrayList<String> names, String name){

        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            if (it.next().equals(name))
                it.remove();
        }

        return names;
    }

    // ============= SOLUTION 3 - removeIf() =============================

    /**
     * removes all the names given as parameter
     * @param names List of String
     * @param name String
     * @return List of String
     */
    public static ArrayList<String> removeName_3(ArrayList<String> names, String name){

        names.removeIf( each -> each.equals(name));

        return names;
    }





}

