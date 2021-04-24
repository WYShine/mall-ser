package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class __46 {
    static class Solution {
        static List<List<Integer>> res = new ArrayList<>();
        public static List<List<Integer>> permute(int[] nums) {
            if (nums == null || nums.length == 0) {
                return res;
            }
            int length = nums.length;
            boolean[] used = new boolean[length];
            List<Integer> tmp = new ArrayList<>();
            dfs(used, nums, 0, tmp);
            return res;
        }

        private static void dfs(boolean[] used, int[] nums, int count, List<Integer> tmp) {
            if (count == nums.length) {
                res.add(new ArrayList<>(tmp));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                tmp.add(nums[i]);
                dfs(used, nums, count + 1, tmp);
                used[i] = false;
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(JsonUtils.toJson(Solution.permute(nums)));
    }
}
