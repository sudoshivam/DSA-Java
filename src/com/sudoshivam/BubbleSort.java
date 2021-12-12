package com.sudoshivam;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 0, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // i is counter to check all the element in arr
            for (int j = 1; j < arr.length-i; j++) { // j will pick each value and compare
                // arr.length-i, bcz we dont compare with already sorted values
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}


