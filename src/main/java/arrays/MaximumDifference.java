package arrays;

public class MaximumDifference {
  public static void main(String[] args) {
    int[] arr = new int[] {2, 3, 10, 6, 4, 8, 1};
    System.out.println(maxDif(arr));
    System.out.println(maxDifEfficient(arr));
  }

  static int maxDif(int[] arr) {
    int maxDif = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] - arr[i] > maxDif) {
          maxDif = arr[j] - arr[i];
        }
      }
    }
    return maxDif;
  }

  static int maxDifEfficient(int[] arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      max = Math.max(max, arr[i + 1]);
      min = Math.min(min, arr[i]);
    }
    return max - min;
  }
}
