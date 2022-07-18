package arrays;
/*
we are going to check is the given array is 
sorted or not 
    1. using two for loops 
    2. using one for loop
 */
public class CheckIfArrayIsSorted {
  public static void main(String[] args) {
  int[] arr = {12,34,75,123};
    System.out.println(isSorted(arr));
    System.out.println(isSorted2(arr));
  }


  /*
  The logic behind this method is the element behind the element
  present in the index of i should be always greater
   */
    private static boolean isSorted(int[] arr) {
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[j]>arr[i]){
                  return false;
              }
          }
      }
      return true;
    }

    /*
    The logic behind this method is the element present next
    to the element present in the i index should be always
    greater
     */
    private static boolean isSorted2(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
