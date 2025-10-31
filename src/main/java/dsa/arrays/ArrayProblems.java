package dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Class containing solutions to common array-based problems.
 */
public class ArrayProblems {





    /**
     * ✅ Problem 5: Remove duplicates from array using HashMap.
     * Returns the count of unique elements.
     * @param nums input array
     * @return count of unique elements
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int uniqueLengthArray(int[] nums){
        int j = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i]))
                continue;
            map.put(j, nums[i]);
            j++;
        }
        return map.size();
    }

    /**
     * ✅ Problem 6: Remove duplicates using HashSet.
     * Returns the count of unique elements.
     * @param nums input array
     * @return count of unique elements
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int uniqueLengthArrayHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size();
    }

    /**
     * ✅ Problem 7: Remove duplicates from sorted array using sorting and two-pointer approach.
     * Modifies the array in-place and returns the length of the unique portion.
     * @param nums input array
     * @return length of array after removing duplicates
     *
     * Time Complexity: O(n log n) for sorting + O(n) = O(n log n)
     * Space Complexity: O(1)
     */
    public int uniqueLengthArraySortingTwoPointers(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums); // Sort the array

        int j = 0; // j is index for last unique element -> Pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) { // Found a new unique element
                j++;
                nums[j] = nums[i]; // Override next unique position
            }
        }
        return j + 1; // New unique length
    }
}


/*
package org.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


//Code to solve array based problems
public class ArrayProblems {

    // Problem Statement 1: Given an array, check if it is sorted in non-decreasing order.
    boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Problem: Given an integer array nums, return true if any value appears at least twice,
    // otherwise return false.
    //Time & Space complexity: O(n)
    boolean isDuplicateDigits(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return true;  // Found a duplicate
            }
            seen.add(num);
        }
        return false;
    }

    //👉 Problem Statement: Given a sorted array nums and a target sum target,
    // find two numbers such that nums[i] + nums[j] == target.
    //Time complexity:  Brute Force Approach (O(n²))
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};  // No solution found
    }

    // Problem Statement: Given an array, move all zeros to the end
    // while maintaining the order of non-zero elements.
    void moveZeros(int[] nums) {
        int left = 0; // Pointer to place non-zero elements

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap non-zero element with left pointer
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;  // Move left pointer
            }
        }

        System.out.println("nums = " + Arrays.toString(nums));
    }


    // Problem: Given a sorted array of integers, remove duplicates in-place such that each element appears only once.
// Return the length of the new array.
    public int uniqueLengthArray(int[] nums){
        int j=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsValue(nums[i]))
                continue;
            map.put(j,nums[i]);
            j++;
        }
        return map.size();
    }

    public int uniqueLengthArrayHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size();
    }


    public int uniqueLengthArraySortingTwoPointers(int[] nums) {
        if (nums.length == 0) return 0; // Edge case
        Arrays.sort(nums); // Sort first (O(n log n))

        int j = 0; // Pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {  // Found a new unique element
                j++;
                nums[j] = nums[i];  // Overwrite next unique position
            }
        }
        return j + 1;  // New unique length
    }


}
*/