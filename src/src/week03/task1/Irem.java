package src.week03.task1;

public class Irem {
    public static void main(String[] args) {

        System.out.println(isPrimeNumber(20));
        System.out.println(isPrimeNumber(15));
        System.out.println(isPrimeNumber(7));

    }




    /**
     * check if a number is prime or not
     * PrimeNumber cannot be exactly divided by any whole number other than itself and 1.
     */


    public static boolean isPrimeNumber(int num){

        if(num <= 1){                   // if the number less than 1, it cannot be prime number
            return false;
        }

        for (int i = 2; i < num; i++) {  // every number can divided by 1. so i should start from 2.
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}

/*
1️⃣ Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
 */