package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-07
 **/

public class __15 {
    static class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            int length = nums.length;
            if (length < 3) {
                return new ArrayList<>();
            }
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                if (nums[i] > 0) {
                    break;
                }
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i + 1;
                int right = length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[right - 1] == nums[right]) {
                            right--;
                        }
                        while (left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }
                        right--;
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(JsonUtils.toJson(Solution.threeSum(nums)));
    }
}
