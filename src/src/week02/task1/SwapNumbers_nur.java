package src.week02.task1;

public class SwapNumbers_nur {

    public static void main(String[] args) {
        int x= 30;
        int y= 5;
        System.out.println("Numbers before swap:\nx:"+x+ "\ny:"+ y);
        x= x*y; //x==150;
        y= x/y; //150/5=30
        x= x/y;

        System.out.println("Numbers after swap:\nx:"+x+ "\ny:"+ y);


    }


}
/*
1️⃣ Numbers -- Swap Numbers
Swap two variable values without using a third variable
 */
