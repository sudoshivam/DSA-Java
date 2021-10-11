// program to find nth fibonacci number
package com.sudoshivam;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        // Fibonacci Sequence = 0,1,1,2,3,5,8...
        int a = 0; // First number in fibonacci sequence
        int b = 1; // Second number in fibonacci sequence
        int count = 2; // We start count from 2 because first 2 no. are already a and b

        while (count < n) {
            int temp = b; // store non-updated value of b to assign in a
            b = b + a; // Here we add previous two numbers to get the next fibonacci number
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
