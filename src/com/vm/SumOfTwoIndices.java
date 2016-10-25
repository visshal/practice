package com.vm;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 */
public class SumOfTwoIndices {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 6};
        int[] result = twoSum(nums, 22);
        for (int i : result)
            System.out.print(i + " ");
    }
}
