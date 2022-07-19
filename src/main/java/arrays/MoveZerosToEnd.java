package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
  public static void main(String[] args) {
    int[] arr = {1, 0, 3, 0, 7, 5, 9, 0, 12, 16, 0};
    int[] result = moveZero(new int[]{1, 0, 3, 0, 7, 5, 9, 0, 12, 16, 0});
    int[] result2 = moveZero2(new int[]{1, 0, 3, 0, 7, 5, 9, 0, 12, 16, 0});

    System.out.println(Arrays.toString(result));
    System.out.println(Arrays.toString(result2));
  }

  private static int[] moveZero(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[j] != 0) {
            swap(arr, i, j);
            break;
          }
        }
      }
    }
    return arr;
  }
  /*
  In this method we are going to keep count as the last index of
  Non zero elements,we create a for loop to traverse the array
  when we find a non-zero element we swap it with the last index
  and increment  the count
   */
  static int[] moveZero2(int[] arr){
    int count=0; // index of the last non-zero element
    for(int i=0;i<arr.length;i++){  // traversal the array
      if(arr[i]!=0){      // check if the current element is non-zero
        swap(arr,count,i);  // if non-zero swap it
        count++;            // increment the count
      }
    }
    return arr;
  }

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
