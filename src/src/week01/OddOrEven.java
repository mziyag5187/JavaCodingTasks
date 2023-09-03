package src.week01;

public class OddOrEven {

    /*
     Numbers-  Odd or even:
     Write  a method which can identify given number is even or odd
     Output ex:
     identify(5); ->"Odd"
     identify(6); ->"Even"
     */
    public static String oddEven(int num) {
        String odd = "Odd";
        String even = "Even";
        if (num %2 == 0) {
            return even;
        } else {
            return odd;
        }

        //identify(5);
        //identify(34);




    }




    public static void OddEven(int num) {


        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }

    public static void identify(int number) {

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}


