package ctci;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
/*
    we need to find if a string has all unique Characters
    possible solutions
    1. can use Set and find
    2. can use Hashtable or HashMap
    3. Iterate the String using 2 for loops
 */
public class IsUnique {
  public static void main(String[] args) {
      String inputString = "unique";
    System.out.println(
            String.format("Finding Result using Set Data Structure %b",
                    findUsingSet(inputString)));
    System.out.println(
            String.format("Finding Result using HashTable Data Structure %b",
                    findUsingHashTable(inputString)));

    System.out.println(String.format("Finding Result using brute Force %b",findUsingBruteForce(inputString)));
  }

  public static boolean findUsingSet(String inputString){
      Set<Character> mySet = new HashSet<>();
      int lengthOfInputString = inputString.length();
      for(int i=0 ;i< lengthOfInputString;i++){             // O(n)
         if(!mySet.add(inputString.charAt(i))){             // O(1)
             return false;
         }
      }
      return true;
  }

  /*

  Let's do time complexity analysis
  for the for loop it's going to take O(n)
  for insertion in set it takes O(1)
  even if we use contains it will take O(1)
  so O(n),

  if you're  using TreeSet instead of HashSet
  then the insertion takes O(log n) and for
  outer loop we have O(n)
  so O(n log n)

  */


  public static boolean findUsingHashTable(String inputString){
      Hashtable<Character,Character> hashtable = new Hashtable<>();
      int lengthOfInputString = inputString.length();
      for(int i=0;i<lengthOfInputString;i++){
          if(hashtable.containsKey(inputString.charAt(i))){
              return false;
          }else{
              hashtable.put(inputString.charAt(i),inputString.charAt(i));
          }
      }
      return true;
  }

  /*

  Let's do time complexity analysis
  for the for loop it's going to take O(n)
  for insertion in Hashtable it takes O(1)
  even if we use contains it will take O(1)
  so O(n),

  if you're  using TreeSet instead of HashSet
  then the insertion takes O(log n) and for
  outer loop we have O(n)
  so O(n log n)

  */

    static boolean findUsingBruteForce(String inputString){
        int lengthOfInputString = inputString.length();

        for(int i=0;i<lengthOfInputString;i++){                 // O(n)
            for(int j=i+1;j<lengthOfInputString;j++){           //
                if(inputString.charAt(i)==inputString.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
