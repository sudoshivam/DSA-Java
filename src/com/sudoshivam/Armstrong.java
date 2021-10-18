// Check if a number is Armstrong number
package com.sudoshivam;

public class Armstrong {
    public static void main (String[] args) {
        int num = 153; // Enter a number or take user input
        System.out.println(checkArmstrong(num));
    }
    static boolean checkArmstrong(int num) {
        int original = num; // Save it for comparing later
        int sum = 0;
        while (num > 0) {
            int rem = num % 10; // Take the last digit
            num /= 10;
            sum += (rem*rem*rem);
        }
        return original == sum;
    }
}
