package src.week02.task1;

public class hasret {
    /*
  ========== Numbers -- Swap Numbers =========
  Swap two variable values without using a third variable
  */
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = b - a;
        b = b - a;
        a = a + b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}