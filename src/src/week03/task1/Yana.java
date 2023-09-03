package src.week03.task1;

public class Yana {

    /**
     1. Numbers -- PrimeNumber
     Write a method that can check if a number is prime or not
     */

    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(17));
    }

    /**
     * checking number is prime or not
     * @param num
     * @return
     */

    public static boolean isPrime(int num){

        if(num<=1){ //1 and 0 are not prime numbers
            return false;
        }


        for(int i = 2; i <= num; i++){  //There is no number that can be completely divided by more than half of the number itself.
                                        // We need to loop through two to the number itself divided by two (num/2).
            if((num%i)==0)
                return  false;
        }


        return true;

    }
}
