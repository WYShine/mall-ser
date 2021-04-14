package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class __33 {
    static class Solution {
        static public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + ((right - left) / 2);
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[mid] >= nums[left]) {
                    // mid在左半端
                    if (target >= nums[left] && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    // mid在右半段
                    if (target > nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        System.out.println(Solution.search(nums, 1));
    }
}
