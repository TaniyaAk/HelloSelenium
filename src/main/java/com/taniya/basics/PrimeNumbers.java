package com.taniya.basics;

//Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
//prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

public class PrimeNumbers {
    public static void main(String args[]){
        int i,a=0,d=0;
        int n=4;//it is the number to be checked
        a=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=a;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    d=1;
                    break;
                }
            }
            if(d==0)  { System.out.println(n+" is prime number"); }
        }
    }
}


