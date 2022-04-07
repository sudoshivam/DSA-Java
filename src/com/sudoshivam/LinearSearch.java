package com.sudoshivam;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 0, 6};
        System.out.println("Array: " + Arrays.toString(arr));
        int target = 3;
        System.out.println("Target: " + target);
        int ans = linearSearch(arr, target);
//        int ans = recLinearSearch(arr, target, 0, arr.length-1);
        if (ans == -1) System.out.println(target + " is not found!");
        else System.out.println(target + " is present at index: " + ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        // This statement will execute if none of the above return has been executed
        return -1;
    }

    static int recLinearSearch(int[] arr, int target, int start, int end) {
        if (end < 1) {
            return -1;
        }
        if (arr[start] == target) {
            return start;
        }
        if (arr[end] == target) {
            return end;
        }
        // Call the function again with start++, end-- to shrink searching range
        return recLinearSearch(arr, target, start+1, end-1);
    }
}
