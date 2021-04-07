package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-06
 **/

public class __80 {
    static class Solution {
        public static int removeDuplicates(int[] nums) {
            int cur = 0;
            int latter = 1;
            int count = 1;
            int length = nums.length;
            while (cur < length && latter < length) {
                if (nums[cur] == nums[latter]) {
                    count++;
                    latter++;
                    continue;
                }
                if (count > 2) {
                    moveLeft(nums, cur + 2, latter);
                    cur += 2;
                    latter = cur + 1;
                    length -= (count - 2);
                    count = 1;
                    continue;
                }
                cur++;
                latter = cur + 1;
                count = 1;
            }
            if (count > 2) {
                moveLeft(nums, cur + 2, latter);
                length -= (count - 2);
            }
            return length;
        }

        private static void moveLeft(int[] nums, int left, int latter) {
            for (int i = left; latter < nums.length; i++, latter++) {
                nums[i] = nums[latter];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(Solution.removeDuplicates(nums));
        System.out.println(JsonUtils.toJson(nums));
    }
}
