package src.week03.task2;

public class ReverseNegativeNum_nur {

    public static void main(String[] args) {
        System.out.println(ReverseNegative(-62));

    }
    public static int ReverseNegative(int a){
        int reverse=0;
        int lastDigit=0;



       while(a <=-1){
           lastDigit= a%10; // a==51, LASTdigit= 1, 4 /  a==62, lastDigit=2 , lastdIGIT=6
           reverse= reverse *10 +lastDigit; // reverse= 1, 14 / reverse =2, 26
           a= a/10; //a=5; /a=6

       }
       return reverse;

    }



}
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53


 */