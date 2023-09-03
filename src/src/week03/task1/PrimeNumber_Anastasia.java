package src.week03.task1;

public class PrimeNumber_Anastasia {
    public static boolean isPrime(int num){
        if(num <=1){ // if num is negative, zero or 1 it is not a prime number
            return false;
        }
        for(int i =2; i <Math.sqrt(num); i++){ // this is the method to return square root of a number
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }

}
// write a method that can check if the number is prime or not