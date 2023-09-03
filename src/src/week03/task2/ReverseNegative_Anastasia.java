package src.week03.task2;

public class ReverseNegative_Anastasia {
    public static int reverseNegative(int num) {
        if (num >= 0) {
            throw new RuntimeException("Number has to be negative " + num); // throws exception if num is positive
        }
        int remander = 0;
        int result = 0;
        while (num != 0) { // loop will run until num num !=0
            remander = num % 10;
            result = (result * 10) + remander;
            num = num / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegative(-561));
    }

}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */