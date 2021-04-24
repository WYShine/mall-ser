package com.wysh1ne.algorithm;

public class __213 {
    static class Solution {
        public static int rob(int[] nums) {
            int length = nums.length;
            if (length == 1) {
                return nums[0];
            }
            if (length == 2) {
                return Math.max(nums[0], nums[1]);
            }
            return Math.max(robRange(nums, 0, length - 1), robRange(nums, 1, length));
        }

        private static int robRange(int[] nums, int start, int end) {
            int[] dp = new int[end - start];
            dp[0] = nums[start];
            dp[1] = Math.max(nums[start], nums[start + 1]);
            for (int i = 2; i < end - start; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i + start], dp[i - 1]);
            }
            return dp[end - start - 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,7,9,2};
        System.out.println(Solution.rob(nums));
    }
}
