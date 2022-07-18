package arrays;

import java.util.Arrays;


public class MoveZerosToEnd {
  public static void main(String[] args) {
    int[] arr = {1, 0, 3, 0, 7, 5, 9, 0, 12, 16, 0};
    for (int i = 0; i < arr.length; i++) {
      if(arr[i]==0){
        for (int j = i + 1; j < arr.length; j++) {
          if(arr[j]!=0){
            swap(arr,i,j);
            break;
          }
        }
      }
    }

    System.out.println(Arrays.toString(arr));
  }

  private static void swap(int[] arr,int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
