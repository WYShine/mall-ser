package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-04
 **/

public class __39 {
    static class Solution {
        static List<List<Integer>> res = new ArrayList<>();
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
                List<Integer> tmp = new ArrayList<>();
                dfs(candidates, 0, target, tmp);

            return res;
        }

        private static void dfs(int[] candidates, int index, int target, List<Integer> tmp) {
            if (index == candidates.length) {
                return;
            }
            int candidate = candidates[index];
            if (target == candidate) {
                tmp.add(candidate);
                res.add(new ArrayList<>(tmp));
                tmp.remove(tmp.size() - 1);
                return;
            }
            if (target < candidate) {
                return;
            }
            tmp.add(candidate);
            dfs(candidates, index, target - candidate, tmp);
            tmp.remove(tmp.size() - 1);
            dfs(candidates, index + 1, target, tmp);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        System.out.println(JsonUtils.toJson(Solution.combinationSum(nums, 7)));
    }
}
