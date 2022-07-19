package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
an element is said to be leader if there is no element
greater than the current element in right side
 */
public class LeaderProblem {
  public static void main(String[] args) {
    int[] arr = new int[] {10, 2, 3, 15,11, 1, 12, 5, 7};
    System.out.println(Arrays.toString(findLeader(arr)));
    System.out.println(Arrays.toString(findLeaderEfficient(arr)));
  }

  /*
    The element present at the last of the array will be in the result
    because we don't have any element at right side to that

    we declare currentHigh with the last element value

    we move from right to left

    we check is the current number is greater than currentHigh

    if yes we add that to result list and set that element as currentHigh

    if not we move to the next element

   */

  static int[] findLeaderEfficient(int[] arr) {
    List<Integer> result = new ArrayList<>();
    int currentHigh = arr[arr.length - 1];
    result.add(currentHigh);
    for (int i = arr.length - 1; i > 0; i--) {
      if (arr[i] > currentHigh) {
        result.add(arr[i]);
        currentHigh=arr[i];
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  /*
  In This method we are going to traverse the array using i loop
  ,we are going to check is there any element greater than the element
  present in the i index by using another for loop j

  if we find any element greater than that we don't add that to list
  if not we add that element to the result
   */
  static int[] findLeader(int[] arr) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      boolean isLeader = true;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] < arr[j]) {
          isLeader = false;
          break;
        }
      }
      if (isLeader) {
        result.add(arr[i]);
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
