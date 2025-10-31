package dsa.arrays;
/**
 * ✅ Problem 3: Find indices of two numbers in a sorted array that add up to a target sum (Brute Force).
 * @ param nums input sorted array
 * @ param target sum
 * @ return indices of the two elements, or {-1, -1} if not found
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class TwoSum {
    public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // No solution found
    }
}
