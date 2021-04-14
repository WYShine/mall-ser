package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-08
 **/

public class __153 {
    static class Solution {
        public static int findMin(int[] nums) {
            int length = nums.length;
            int left = 0, right = length - 1;

            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] > nums[right]) {
                    left = mid + 1;
                } else if (nums[mid] < nums[right]) {
                    right = mid;
                }
            }
            return nums[left];
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(Solution.findMin(nums));
    }
}
