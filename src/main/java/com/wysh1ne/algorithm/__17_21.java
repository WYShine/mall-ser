package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-02
 * https://leetcode-cn.com/problems/volume-of-histogram-lcci/
 **/

public class __17_21 {
    static class Solution {
        public static int trap(int[] height) {
            int length = height.length;
            if (length == 0) {
                return 0;
            }
            int[] leftMax = new int[length];
            leftMax[0] = height[0];
            int[] rightMax = new int[length];
            rightMax[length - 1] = height[length - 1];
            for (int i = 1; i < length; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            }
            for (int i = length - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], height[i]);
            }
            int count = 0;
            for (int i = 1; i < length - 1; i++) {
                count += Math.max(0, Math.min(leftMax[i - 1], rightMax[i + 1]) - height[i]);
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Solution.trap(height));
    }
}
