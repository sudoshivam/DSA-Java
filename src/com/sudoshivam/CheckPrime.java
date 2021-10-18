// Program to check if given number is prime
package com.sudoshivam;

public class CheckPrime {
    public static void main(String[] args) {
        int num = 89; // Enter any number or take user input
        System.out.println(checkPrime(num));
    }
    static boolean checkPrime(int num) {
        /*
         Logic - Factors of any number can be found between 1
         and square root of that number i.e. 2 >= n <= sqrt(num)
         eg. Factors of 36 = 1, 2, 3, 4, 6 after this it just repeats
         i.e 2*18 and 18*2 are same, 3*12 and 12*3 are same.
        */
        if (num <= 1) {
            return false;
        }
        int n = 2; // we start checking from 2 because 1 is factor of all no.

        while (n * n <= num) {
            if (num % n == 0) {
                return false;
            }
            n++;
        }
        return true;
    }
}
