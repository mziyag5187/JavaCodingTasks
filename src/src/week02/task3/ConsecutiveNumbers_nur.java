package src.week02.task3;

public class ConsecutiveNumbers_nur {
    public static void main(String[] args) {
        int n= 31;
        String result="";
        String i2= "Codility";
        String i3= "Test";
        String i5= "Coders";


        for (int i = 1; i < n ; i++) {
            boolean two= i%2==0 ;
            boolean three= i%3 ==0 ;
            boolean five=  i%5 ==0;
            if(two && three && five){
                result+= i2+i3+i5;
            } else if (two && three) {
                result +=i2+i3;
            } else if (two && five) {
                result += i2+i5;
            } else if (three&&five) {
                result += i3+i5;
            }else if(two){
                result+=i2;
            } else if (three) {
                result+=i3;
            } else if (five) {
                result +=i5;
            } else {
                result += i ;
            }
            result+= "\n";
        }
        System.out.println(result);

    }


}
/*
Numbers -- print consecutive numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
  Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should
  be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
   For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5,
   should be replaced by CodilityTestCoders.

For example, here is the output for N = 17:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */
