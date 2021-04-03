package com.wysh1ne.algorithm.common;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-01
 **/

public class CommonUtil {
    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
