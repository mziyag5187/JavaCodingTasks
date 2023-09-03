package src.week02.task1;

public class Irem {
    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        // Before swapping
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        // After swapping
        System.out.println("a = " + a);
        System.out.println("b = " + b);







    }




}
// Swap two variable values without using a third variable