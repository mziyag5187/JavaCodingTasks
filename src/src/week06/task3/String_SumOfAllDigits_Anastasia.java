package src.week06.task3;

public class String_SumOfAllDigits_Anastasia {
    /*
    Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
     */
    public  static int sumOfDigits( String str){

        String temporary = "";
         int sum = 0; // sum of all numbers presented in the String

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); // each character in the String
            if(Character.isDigit(ch)){ // if character is a digit
                temporary +=ch; // add char to temporary string
            }else{
                sum += Integer.parseInt(temporary);
            }
            temporary = "";
        }

        return sum + Integer.parseInt(temporary);
    }

    public static void main(String[] args) {
        String str = "1banana2apple8pear";
        sumOfDigits(str);

    }

}
