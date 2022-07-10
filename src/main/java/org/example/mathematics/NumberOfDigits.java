package org.example.mathematics;

import java.util.Random;

public class NumberOfDigits {
  public static void main(String[] args) {
    int randomNumber =123;
    System.out.println(Math.floor( 2.99));
    System.out.printf(
        "no of digits for %d is %d using Iteration Method",
        randomNumber, countByIteration(randomNumber));
    System.out.printf(
        "\nno of digits for %d is %d using Recursive Method",
        randomNumber, countByRecursion(randomNumber));
    System.out.printf(
        "\nno of digits for %d is %d using Log Method", randomNumber, countByLog(randomNumber));
  }

  public static int countByIteration(int number) {
    if (number == 0) {
      return 1;
    }
    int count = 0;
    while (number != 0) {
      count++;
      number = number / 10;
    }
    return count;
  }

  public static int countByRecursion(int number) {
    if (number == 0) {
      return 0;
    }
    return 1 + countByRecursion(number / 10);
  }

  public static int countByLog(int number) {

    return (int) Math.floor(Math.log10(number) + 1);
  }
}
