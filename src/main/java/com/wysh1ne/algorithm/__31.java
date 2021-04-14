package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

import java.util.Arrays;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class __31 {
    static class Solution {
        public static void nextPermutation(int[] nums) {
            if (nums.length <= 1) {
                return;
            }
            int first = nums.length - 2, second = nums.length - 1;
            while (first >= 0) {
                if (nums[first] < nums[second]) {
                    break;
                }
                first--;
                second--;
            }
            if (first < 0) {
                reverse(nums, 0);
                return;
            }
            int lastLagerThanFirst = nums.length - 1;
            while (lastLagerThanFirst > 0) {
                if (nums[lastLagerThanFirst] > nums[first]) {
                    break;
                }
                lastLagerThanFirst--;
            }
            swap(nums, first, lastLagerThanFirst);
            reverse(nums, first + 1);
        }

        private static void reverse(int[] nums, int start) {
            int i = start, j = nums.length - 1;
            while (i < j) {
                swap(nums, i++, j--);
            }
        }

        private static void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {3,2,1};
        int[] nums3 = {1,1,5};
        int[] nums4 = {1};
        int[] nums5 = {1,3,2};
        int[] nums6 = {1,2,3,4,6,5};
        Solution.nextPermutation(nums1);
        Solution.nextPermutation(nums2);
        Solution.nextPermutation(nums3);
        Solution.nextPermutation(nums4);
        Solution.nextPermutation(nums5);
        Solution.nextPermutation(nums6);
        System.out.println(JsonUtils.toJson(nums1));
        System.out.println(JsonUtils.toJson(nums2));
        System.out.println(JsonUtils.toJson(nums3));
        System.out.println(JsonUtils.toJson(nums4));
        System.out.println(JsonUtils.toJson(nums5));
        System.out.println(JsonUtils.toJson(nums6));
    }
}
