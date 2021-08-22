package com.taniya;
import java.util.Arrays;
import java.util.TreeSet;

/*This example shows you how to find largest or maximum number in an array
                       [[[[  Basically, Comparing loop array with the index ]]]]
        Step 1:
             Initialize array value
        Step 2:  (int max = x[0];)
             Initialize max value as array's first value
        Step 3: (for int i = 1; i < x.length; i++ )
             Iterate array using a for loop (exclude arrays first position 0, since it was assumed as max value)
        Step 4: if(x[i] > max)
             Use if condition to compare array current value with max value, if current array value is greater than max then
             assign array current value as max (max = x[i];).
        Step 5:
             Continue the loop and resign the max value if array current value is greater than max */
public class LargestNumber {
    public static void main(String[] args) {
        int[] x = new int[]{19, 33, 50, 61, 30, 31, 36};
        int max = x[0];
        //Ex 1:
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }

        // Ex 2:
        for(int i: x){
            if(i>max){
                max = i;
            }
        }
        System.out.println("Ex 1: All the numbers in array: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Ex 2: All the numbers in array: ");
        for(int i: x){
            System.out.println(i);

        }

        System.out.println("The largest number in the intArray is: " + max);


    }

}
