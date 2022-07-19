package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotateTheArray {
  public static void main(String[] args) {

    System.out.println(
        Arrays.toString(new int[] {2, 5, 8, 9, 12})
            + "->"
            + Arrays.toString(rotateTheArrayByOne(new int[] {2, 5, 8, 9, 12})));

    int[] arr = {2, 5, 8, 9, 12};
    rotate(arr, 3);
    System.out.println("{2, 5, 8, 9, 12} using recursion" + "->" + Arrays.toString(arr));

    List<Integer> arrList =
        Arrays.stream(arr).mapToObj((e) -> Integer.valueOf(e)).collect(Collectors.toList());
    Collections.rotate(arrList, 3);
    System.out.println(arrList);

    System.out.println(
        Arrays.toString(new int[] {2, 5, 8, 9, 12})
            + "->"
            + Arrays.toString(rotateTheArrayByNTimesEasy(new int[] {2, 5, 8, 9, 12}, 3)));
    System.out.println(
        Arrays.toString(new int[] {2, 5, 8, 9, 12})
            + "->"
            + Arrays.toString(rotateTheArrayByNDigits(new int[] {2, 5, 8, 9, 12}, 3)));
  }

  static int[] rotateTheArrayByOne(int[] arr) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }

    arr[arr.length - 1] = temp;
    return arr;
  }

  static int[] rotateTheArrayByNTimesEasy(int[] arr, int digits) {
    for (int i = 0; i < digits; i++) {
      arr = rotateTheArrayByOne(arr);
    }
    return arr;
  }

  static int[] rotateTheArrayByNDigits(int[] arr, int digits) {
    int[] temp = new int[digits];
    for (int i = 0; i < digits; i++) {
      temp[i] = arr[i];
    }
    for (int i = 0; i < arr.length - digits; i++) {
      arr[i] = arr[digits + i];
    }
    for (int i = 0; i < temp.length; i++) {
      arr[digits - 1 + i] = temp[i];
    }
    return arr;
  }

  static void rotate(int[] arr, int digits) {
    helper(arr, 0, digits - 1);
    helper(arr, digits, arr.length - 1);
    helper(arr, 0, arr.length - 1);
  }

  static void helper(int[] arr, int i, int j) {
    int low = i;
    int high = j;
    while (low < high) {
      swap(arr, low, high);
      low++;
      high--;
    }
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
