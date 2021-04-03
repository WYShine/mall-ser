package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.CommonUtil;
import com.wysh1ne.algorithm.common.JsonUtils;

import static com.wysh1ne.algorithm.common.CommonUtil.swap;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-01
 **/

public class __215 {
    static class Solution {
        public static int findKthLargest(int[] nums, int k) {
            int left = 0, right = nums.length - 1;
            int target = nums.length - k;
            while (true) {
                int pivot = pivot(nums, left, right);
                if (pivot == target) {
                    return nums[pivot];
                }
                if (pivot > target) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }

        private static int pivot(int[] nums, int left, int right) {
            int i = left, j = right;
            int tmp = nums[left];
            while (i < j) {
                while (nums[j] > tmp) {
                    j--;
                }
                if (i < j) {
                    swap(nums, i++, j);
                }
                while (nums[i] < tmp) {
                    i++;
                }
                if (i < j) {
                    swap(nums, i, j--);
                }
            }
            nums[i] = tmp;
            return i;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,2,4,1,3,6,0};
        System.out.println(JsonUtils.toJson(Solution.findKthLargest(nums, 4)));
    }
}
