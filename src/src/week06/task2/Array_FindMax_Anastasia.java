package src.week06.task2;

public class Array_FindMax_Anastasia {
    /*
    Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */
  public static int maxNumber( int[]arr){
      int max = 0;
      for(int i = 1; i < arr.length; i++){
          if(arr[i]>0){
              max= arr[i];
          }
      }
      return max;
  }

    public static void main(String[] args) {
        int [] num = {1,2,3,8,0,9,22,34};
        System.out.println(maxNumber(num));

    }


}
