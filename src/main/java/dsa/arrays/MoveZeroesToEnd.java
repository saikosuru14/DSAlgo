package dsa.arrays;

import java.util.Arrays;

/**
 * ✅ Problem 4: Move all zeros to the end while maintaining the order of non-zero elements.
 * param nums input array
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MoveZeroesToEnd {
    void moveZeros(int[] nums) {
        int left = 0; // Position to place the next non-zero element

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap non-zero to the left
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }

        System.out.println("nums = " + Arrays.toString(nums));
    }
}
