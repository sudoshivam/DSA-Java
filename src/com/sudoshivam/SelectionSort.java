package com.sudoshivam;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 5, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        // pick max element in a range (0 to 'last') and put it at right index
        for (int i = 0; i < arr.length; i++) { // we have to pick all elmnt to check their right index
            int last = arr.length - i - 1; // index of last unsorted element, ignore already sorted elmnts
            int max = getMax(arr, last); // index of max elmnt in the range
            // swap arr[max] with arr[last]
            int temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
    }

    static int getMax(int[] arr, int last) {
        int maxIndex = 0;
        for (int i = 1; i <= last; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }
}
