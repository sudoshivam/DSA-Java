// Program to reverse a number
package com.sudoshivam;
import java.util.Scanner;
public class ReverseNumber {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rev = 0;
        while (num > 0) {
            int rem  = num % 10; // add last digit from num to rem
            num  /= 10; // remove last digit from num

            rev = rev * 10 + rem;
            /* add current value of rem to rev and shift it to left
            for adding next value of rem */
        }
        System.out.println(rev);
    }
}
