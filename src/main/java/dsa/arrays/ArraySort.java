package dsa.arrays;

public class ArraySort {
    /**
     * ✅ Problem 1: Check if an array is sorted in non-decreasing order.
     * @param arr input array
     * @return true if sorted, false otherwise
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Found a decreasing pair
            }
        }
        return true;
    }
}
