package com.sudoshivam;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 0, 1, 4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // arr.length-1 bcz j is i+1 and it shouldn't go out of bound
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) { // compare i & i-1 and swap when required
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                    // if current(ith) element is greater tht means all LHS element are already sorted so
                    // skip checking left elmnts and move i to right elmnt
                }
            }
        }
    }
}
