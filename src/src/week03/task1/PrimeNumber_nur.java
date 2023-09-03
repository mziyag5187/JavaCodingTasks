package src.week03.task1;

public class PrimeNumber_nur {
    public static void main(String[] args) {
        System.out.println(isPrime(21));

    }

    public static boolean isPrime(int n){
        if(n<=0){
            return false;
        }
        for(int i=2; i<n; i++ ){
            if(n%i ==0 ){
                return false;
            }

        }
        return true;

    }
}

/*
Write a method that can check if a number is prime or not

 */
