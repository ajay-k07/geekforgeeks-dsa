package org.example.mathematics;
/*
   Day 2 Check the given number is palindrome or not

   A number is palindrome if number and the reverse of
   given number is same
   for 121 the reverse of 121 is again 121 so its palindrome
   for 123 the reverse of 123 is 321 321 is not equal to 123
   ,so it's not palindrome

   we can solve this using
       1. mod method
       2. String builder reverse method


*/
public class Palindrome {
  public static void main(String[] args) {
    System.out.println(1/10);
    int inputNumber = 1221;
    System.out.println(usingModMethod(inputNumber));
    System.out.println(usingStringBuilder(inputNumber));
  }

  static boolean usingModMethod(int inputNumber) {
    int reverseNumber = 0;
    int temp = inputNumber;
    while (temp > 0) {
      int lastDigit = temp % 10;
      reverseNumber = reverseNumber * 10 + lastDigit;
      temp=temp/10;
    }
    if (reverseNumber == inputNumber) {
      return true;
    }
    return false;
  }
  static boolean usingStringBuilder(int inputNumber){
    String str = String.valueOf(inputNumber);
    StringBuilder br = new StringBuilder(str);
    String reverse = br.reverse().toString();
    if(str.equals(reverse)){
      return true;
    }
    return false;
  }
}
