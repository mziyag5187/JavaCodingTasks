package src.week03.task2;

public class Yana {

    /**
     2. Reverse a number
     */

    public static void main(String[] args) {
        reverse(-345);
        reverse2(-2231);
    }

    /**
     * reverse a number
     * @param num
     * @return
     */

    public static void reverse(int num){
        num = Math.abs(num);

        String number = num + "";
        String reversed = "";

        for (int i = number.length()-1; i >= 0; i--) {
            reversed += number.charAt(i);
        }

        num = Integer.parseInt(reversed);
        num *= -1;

        System.out.println("Reversed: " + num);
    }



    //mathematical logic
    public static void reverse2(int number){
        int reverse = 0;
        number = Math.abs(number);

        while(number != 0) {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;

        }
        reverse *= -1;


        System.out.println("Reversed: " + reverse);
    }



}
