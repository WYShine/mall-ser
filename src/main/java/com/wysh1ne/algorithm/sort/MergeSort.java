package com.wysh1ne.algorithm.sort;

import com.wysh1ne.algorithm.common.JsonUtils;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        mergeSort(nums);
        System.out.println(JsonUtils.toJson(nums));
    }

    public static void mergeSort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + ((right - left) / 2);
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);
            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        int cur1 = left, cur2 = mid + 1;
        int[] tmpNums = new int[right - left + 1];
        int cur = 0;
        while (cur1 <= mid && cur2 <= right) {
            if (nums[cur1] > nums[cur2]) {
                tmpNums[cur++] = nums[cur2++];
            } else {
                tmpNums[cur++] = nums[cur1++];
            }
        }
        while (cur1 <= mid) {
            tmpNums[cur++] = nums[cur1++];
        }
        while (cur2 <= right) {
            tmpNums[cur++] = nums[cur2++];
        }
        for (int i = left; i <= right; i++) {
            nums[i] = tmpNums[i - left];
        }
    }

}
