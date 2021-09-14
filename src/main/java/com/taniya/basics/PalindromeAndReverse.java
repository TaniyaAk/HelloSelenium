package com.taniya.basics;

//A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either direction,
// generally if used comma, separators or other word dividers are ignored.


import java.util.Scanner;

public class PalindromeAndReverse {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        reverseCharAt();
        //arrayPalindrome();

    }

    public static void reverseCharAt() {
        System.out.println("Enter a word to check: ");
        //given string
        String name = scan.nextLine();
        //create an empty string
        String reverse = "";
        //iterate from last index of the string
        for (int i = name.length() - 1; i >= 0; i--) {
            //add each character from the last index to the first to the empty string to reverse the given string
            reverse = reverse + name.charAt(i);
        }

        if (name.equals(reverse)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }
    }

    public static void arrayPalindrome() {
        System.out.println("Enter a word to check: ");
        //given string
        String name = scan.nextLine();

        StringBuilder rev = new StringBuilder(name);
        rev.reverse();

        if (name.equals(rev)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }


    }
}
