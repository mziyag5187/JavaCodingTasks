package src.week03.task2;

public class Irem {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-55));
        System.out.println(reverseNegative(-120));
        System.out.println(reverseNegative(-23));

    }

    /**
     * reverse digits of a negative number and return it as int
     */

    public static int reverseNegative(int num){

        if(num >= 0 ){
            System.out.println("Number cannot be positive or zero");
        }

        int reverseNum = 0;

        while(num < 0){

            int number = num % 10;
            reverseNum = reverseNum * 10 + number;
            num /= 10;
        }

        return reverseNum;

    }

}
/*

2️⃣ Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */