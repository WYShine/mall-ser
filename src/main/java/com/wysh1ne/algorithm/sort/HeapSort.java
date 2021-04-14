package com.wysh1ne.algorithm.sort;

import com.wysh1ne.algorithm.common.JsonUtils;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-08
 **/

public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {7,5,6,4,2,3,1,9,10};
        heapSort(nums);
        System.out.println(JsonUtils.toJson(nums));
    }

    private static void heapSort(int[] nums) {
        int length = nums.length;
        for (int i = length - 1; i >= 0; i--) {
            heapSort(nums, i);
            swap(nums, 0, i);
        }
    }

    private static void heapSort(int[] nums, int right) {
        int start = (right - 1) / 2;
        for (int i = start; i >= 0; i--) {
            int maxIndex = i;
            int max = nums[i];
            int leftChildIndex = i * 2 + 1;
            if (leftChildIndex <= right && nums[leftChildIndex] > max) {
                max = nums[leftChildIndex];
                maxIndex = leftChildIndex;
            }
            int rightChildIndex = i * 2 + 2;
            if (rightChildIndex <= right && nums[rightChildIndex] > max) {
                maxIndex = rightChildIndex;
            }
            swap(nums, i, maxIndex);
        }
    }

    private static void swap(int[] nums, int i, int maxIndex) {
        if (i == maxIndex) {
            return;
        }
        int tmp = nums[i];
        nums[i] = nums[maxIndex];
        nums[maxIndex] = tmp;
    }
}
