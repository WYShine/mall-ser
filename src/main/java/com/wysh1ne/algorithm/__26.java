package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

public class __26 {
    static class Solution {
        public static int removeDuplicates(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int validCur = 1, tmp = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != tmp) {
                    nums[validCur++] = nums[i];
                    tmp = nums[i];
                }
            }
            return validCur;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Solution.removeDuplicates(nums));
        System.out.println(JsonUtils.toJson(nums));
    }
}
