// Print all Armstrong number of given digit
package com.sudoshivam;

public class Armstrong {
    public static void main (String[] args) {
        /* For 3 digit number we take 100 to 999 */
        for (int i = 100; i <= 999; i++) {
            if (checkArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean checkArmstrong(int num) {
        int original = num; // Save it for comparing later
        int sum = 0;
        while (num > 0) {
            int rem = num % 10; // Take last digit in rem
            num /= 10; // Remove last digit from num
            // We do sum of 'cube' of every digit because no. of digits in num = 3
            sum += (rem*rem*rem);
        }
        return original == sum;
    }
}
