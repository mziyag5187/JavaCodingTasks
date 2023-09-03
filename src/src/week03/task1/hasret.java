package src.week03.task1;

public class hasret {
    public static void main(String[] args) {
        /**
         1. Numbers -- PrimeNumber
         Write a method that can check if a number is prime or not
         */


        System.out.println(isPrime(5));
        System.out.println(isPrime(8));
        System.out.println(isPrime(17));
        System.out.println(isPrime(55));
        System.out.println(isPrime(87));


    }

    /**
     * checking number is prime or not
     * @param number
     * @return
     */
    public static boolean isPrime(int number) { // prime number means it can divide only itself and 1, also there should not be any left over

        for (int i = 2; i < number; i++) { // if number can divide any number evenly , it is not prime number
            if (number % i == 0) {
                return false;
            }
        }

        return true; // if the number can divide evenly only itself and 1-> it is prime


    }

}

