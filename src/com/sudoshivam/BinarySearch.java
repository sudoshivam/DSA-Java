package com.sudoshivam;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 8, 12, 45};
        int target = 8;
        int ans = recBinarySearch(arr, target, 0, arr.length-1);
        if (ans == -1) System.out.println(target + " is not found in array!");
        else System.out.println(target + " is found at index: " + ans);
    }
    // iterative algorithm
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // mid = (start + end) / 2, but start+end can exceed the range of 'int' so we use -
            int mid = start + (end - start) / 2; // this will not exceed the range of 'int'

            if (target < arr[mid]) {
                // discard all elements in the right search space
                // including the mid element
                end = mid - 1;
            } else if (target > arr[mid]) {
                // discard all elements in the left search space
                // including the mid element
                start = mid + 1;
            } else {
                // target found
                return mid;
            }
        }
        // if above 'return' doesn't execute i.e. target not found then return -1
        return -1;
    }
    // recursive algorithm
    static int recBinarySearch(int[] arr, int target, int start, int end)
    {
        // Base condition (search space is exhausted)
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        // Base condition (key value is found)
        if (target == arr[mid]) {
            return mid;
        }
        else if (target < arr[mid]) {
            return recBinarySearch(arr, target, start,  mid - 1);
        }
        else {
            return recBinarySearch(arr, target,mid + 1,  end);
        }
    }
}
