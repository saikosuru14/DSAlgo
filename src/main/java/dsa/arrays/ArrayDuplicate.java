package dsa.arrays;

import java.util.HashSet;

public class ArrayDuplicate {
    /**
     * ✅ Problem 2: Check if any value appears at least twice in the array.
     * @param arr input array
     * @return true if duplicates exist, false otherwise
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    boolean isDuplicateDigits(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }
        return false;
    }

}
