// program to find occurrence of a number in given sequence
package com.sudoshivam;
import java.util.Scanner;
public class Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a sequence: ");
        int seq = in.nextInt();
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        // We've to count the occurrence of n in seq
        int count = 0; // Counter variable
        while (seq > 0) {
            int rem = seq % 10; // here remainder will be the last digit of sequence
            if (rem == n) {
                // check if last digit is n
                count++;
                seq = seq / 10; // this will remove the last digit of seq
            }
            else {
                seq = seq / 10;
            }
        }
        System.out.println(count);
    }
}
