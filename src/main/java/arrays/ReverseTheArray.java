package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheArray {
  public static void main(String[] args) {
    int[] arr = {2, 5, 8, 9, 12};
    List<Integer> arrList = Arrays.stream(arr).mapToObj((e)->Integer.valueOf(e)).collect(Collectors.toList());
    Collections.rotate(arrList,1);
    System.out.println(arrList.toString());
    System.out.println(
        Arrays.toString(new int[] {2, 5, 8, 9, 12})
            + "->"
            + Arrays.toString(reverseTheArrayByOne(new int[] {2, 5, 8, 9, 12})));
    System.out.println(
        Arrays.toString(new int[] {2, 5, 8, 9, 12})
            + "->"
            + Arrays.toString(reverseTheArrayByNTimesEasy(new int[] {2, 5, 8, 9, 12}, 3)));
    System.out.println(
        Arrays.toString(new int[] {2, 5, 8, 9, 12})
            + "->"
            + Arrays.toString(reverseTheArrayByNDigits(new int[] {2, 5, 8, 9, 12}, 3)));
  }

  static int[] reverseTheArrayByOne(int[] arr) {
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }

    arr[arr.length - 1] = temp;
    return arr;
  }

  static int[] reverseTheArrayByNTimesEasy(int[] arr, int digits) {
    for (int i = 0; i < digits; i++) {
      arr = reverseTheArrayByOne(arr);
    }
    return arr;
  }

  static int[] reverseTheArrayByNDigits(int[] arr, int digits) {
    int[] temp = new int[digits];
    for(int i=0;i<digits;i++){
      temp[i]=arr[i];
    }
    for(int i=0;i<arr.length-digits;i++){
        arr[i]=arr[digits+i];
    }
    for(int i=0;i<temp.length;i++){
        arr[digits-1+i]=temp[i];
    }
    return arr;
  }
}
