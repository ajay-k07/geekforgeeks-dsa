package org.example.day2;

import java.util.logging.Logger;

public class SumofNumbers {

    public static void main(String[] args) {
        Logger logger =  Logger.getLogger(SumofNumbers.class.getName());
        logger.info(String.valueOf(sumOfNumbers(5)));
    }
    public static  int sumOfNumbers(int n){
        int sum =0;
       for(int i=1;i<=n;i++) {
           sum +=i;
       }
       return sum;
    }

    public static int sumOfNumbers2(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum++;
            }
        }
        return sum;
    }


    public static int sumOfNumbers3(int n){
        return n*(n+1)/2;
    }
}
