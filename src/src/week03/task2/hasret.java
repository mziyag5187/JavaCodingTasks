package src.week03.task2;

public class hasret {
    public static void main(String[] args) {
        /*
               2.Numbers -- Reverse Negative Number
               Write a return method that can reverse digits of a negative number and return it as int
               input: -35  output: -53
         */


       /* int negativeNumber = -35;

        String n = Integer.toString(negativeNumber);  // converting int negative number to String

        String zero = n.substring(0,1); // taking index=0 element from String
        String first = n.substring(1,2); // taking index=1 element from String
        String second = n.substring(2); // taking index=2 element from String

        String reversed = zero+second+first; // concatenation

        int reversedNegativeNumber = Integer.parseInt(reversed); // after digits is reversed, convert again int value

        System.out.println("reversedNegativeNumber = " + reversedNegativeNumber);

        */


        negativeReversed(-67);
        negativeReversed(-73);
        negativeReversed(-29);
        negativeReversed(-19);


    }

    public static int negativeReversed(int negativeNumber) {


        String n = Integer.toString(negativeNumber);  // converting int negative number to String

        String zero = n.substring(0, 1); // taking index=0 element from String
        String first = n.substring(1, 2); // taking index=1 element from String
        String second = n.substring(2); // taking index=2 element from String

        String reversed = zero + second + first; // concatenation

        int reversedNegativeNumber = Integer.parseInt(reversed); // after digits is reversed, convert again int value

        System.out.println("reversedNegativeNumber = " + reversedNegativeNumber);

        return reversedNegativeNumber;


    }


}

