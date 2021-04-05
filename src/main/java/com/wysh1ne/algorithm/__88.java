package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

import java.util.Arrays;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-05
 **/

public class __88 {
    static class Solution {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            if (m == 0) {
                if (n >= 0) {
                    System.arraycopy(nums2, 0, nums1, 0, n);
                }
            }
            int index = m + n - 1;
            int cur1 = m - 1, cur2 = n - 1;
            while (cur1 >= 0 && cur2 >= 0) {
                if (nums1[cur1] > nums2[cur2]) {
                    nums1[index] = nums1[cur1--];
                } else {
                    nums1[index] = nums2[cur2--];
                }
                index--;
            }
            while (cur1 >= 0) {
                nums1[index--] = nums1[cur1--];
            }
            while (cur2 >= 0) {
                nums1[index--] = nums2[cur2--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        Solution.merge(nums1, 1, nums2, 1);
        System.out.println(JsonUtils.toJson(nums1));
    }
}
