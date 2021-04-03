package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-01
 **/

public class __53 {
    static class Solution {
        public static int maxSubArray(int[] nums) {
            int length = nums.length;
            int[] dp = new int[length + 1];
            dp[0] = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < length; i++) {
                dp[i + 1] = Math.max(dp[i] + nums[i], nums[i]);
                max = Math.max(dp[i+1], max);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Solution.maxSubArray(nums));
    }
}
