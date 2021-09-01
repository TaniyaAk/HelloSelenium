package com.taniya;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class ReverseString {

//    A String variable contains a collection of characters surrounded by double quotes:
//    There are many different ways to reverse a string in Java..
//    For instance, we can use primitive data types: "byte" to extract the characters.
//

    public static void main(String[] args) {
        arrayPalindrome();

    }
    public static void firstExample(){
        System.out.println("Taniya");


        System.out.println("Reverse String Is");

        {
            String strInput = "Taniya";
            String strInputTwo = "Array";


//            getBytes () method to convert string
//            into bytes[]


            byte[] strAsByteArray = strInput.getBytes();
            byte[] result = new byte[strAsByteArray.length];

            for (int i = 0; i < strAsByteArray.length; i++)
                result[i] = strAsByteArray[strAsByteArray.length - i - 1];


            System.out.println(new String(result));
        }
    }
    //2. Using Character Array
    public static void arrayPalindrome() {

        String str = "Taniya";
        String rev = "";

        char a[] = str.toCharArray();
        int len = a.length;

        {
            for (int i = len - 1; i >= 0; i--) {
                rev = rev + a[i];
            }
            System.out.println("reverse string is : "+rev);

        }
    }
}
