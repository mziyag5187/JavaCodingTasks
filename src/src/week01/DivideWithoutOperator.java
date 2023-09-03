package src.week01;

public class DivideWithoutOperator {

     /*

         Numbers - Divide without / operator:
         Write a method that can divide two numbers without using division operator

         */
        public static double divisionWithoutOperator(int nominator, int denominator) {
            if (nominator == 0) { // nominator = 0, it will always return 0
                return 0;
            }
            if (denominator == 0) {
                throw new ArithmeticException("Denominator can not be 0"); // you can not divide by 0
            }
            int sign = 1;
            if (nominator < 0 && denominator > 0 || nominator > 0 && denominator < 0) { // if nominator or denominator is negative, it will return negative number as a result
                sign = -1;
            }

            nominator = Math.abs(nominator); // math.abs method will return non-negative number even if we use "-" before numbers
            denominator = Math.abs(denominator);
            int intCount = 0;
            while (nominator >= denominator) { // loop will run as long as nominator >= denominator and it will add +1 to the count every time it runs
                nominator -= denominator; // it will subtract denominator everytime loop runs
                intCount++;

            }


            double decimalCount = 0;
            if (nominator < denominator&&nominator!=0) { // nominator is less than denominator
                nominator = nominator * 10; // simple math manipulation to operate decimal numbers, thats why we had to *10
                while (nominator>=denominator){ // loop will run as long as nominator *10 is more than denominator
                    nominator-=denominator; // every time loop runs it will subtract
                    decimalCount+=0.1;
                }

            return (intCount+decimalCount)*sign;
        }


        return (intCount+decimalCount)*sign;


    }

        public static int DivideTwoNumbers(int n1, int n2){

            if( n2==0){
                System.err.println("Divisor cannot be zero");
            }

            if(n1 ==0){
                System.out.println(0);
            }

            int quotient = 0;

            while(n1 >= n2){
                n1 -= n2;

                quotient++;
            }

            return quotient;
        }


    public static void main(String[] args) {
        System.out.println(divisionWithoutOperator(5, -2));
        System.out.println(divisionWithoutOperator(6, 2));
        System.out.println(divisionWithoutOperator(1, -2));
        System.out.println(divisionWithoutOperator(8, 3));
        System.out.println(divisionWithoutOperator(1,134));

    }

    }


