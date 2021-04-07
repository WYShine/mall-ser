package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-07
 **/

public class __81 {
    static class Solution {
        public static boolean search(int[] nums, int target) {
            int n = nums.length;
            if (n == 0) {
                return false;
            }
            if (n == 1) {
                return nums[0] == target ? true : false;
            }
            int l = 0, r = n - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (nums[mid] == target) {
                    return true;
                }
                if (nums[mid] == nums[l]) {
                    l++;
                    continue;
                }
                if (nums[mid] == nums[r]) {
                    r--;
                    continue;
                }

                if (nums[l] <= nums[mid]) {
                    if (nums[l] <= target && target < nums[mid]) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    if (nums[mid] < target && target <= nums[r]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        System.out.println(Solution.search(nums, 0));
        System.out.println(Solution.search(nums, 1));
        System.out.println(Solution.search(nums, 3));
        System.out.println(Solution.search(nums, 5));
        System.out.println(Solution.search(nums, 15));
    }
}
