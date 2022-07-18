package arrays;

import java.util.Arrays;

/*
Find the largest Number
 iterate all the elements compare with
 the max element and make it as max if its greater than max
 */
public class LargestElement {
  public static void main(String[] args) {
    int[] arr = {3, 12, 1, 16};
    System.out.println(findLargestNumber(arr));
    System.out.println(findLargestNumber2(arr));
    System.out.println(findLargestNumber3(arr));
  }

  static int findLargestNumber(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean flag = true;
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          flag = false;
          break;
        }
      }
      if (flag == true) {
        return arr[i];
      }
    }
    return -1;
  }

  static int findLargestNumber2(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }

  static int findLargestNumber3(int[] arr){
    Arrays.sort(arr);
    return arr[arr.length-1];
  }
}
