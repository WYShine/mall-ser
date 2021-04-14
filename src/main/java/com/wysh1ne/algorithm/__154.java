package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class __154 {
    class Solution {
        public int findMin(int[] nums) {
            int length = nums.length;
            int left = 0, right = length - 1;

            while (left < right) {
                int mid = (left + right) / 2;
                if (nums[mid] > nums[right]) {
                    left = mid + 1;
                } else if (nums[mid] < nums[right]) {
                    right = mid;
                } else {
                    right--;
                }
            }
            return nums[left];
        }
    }
}
