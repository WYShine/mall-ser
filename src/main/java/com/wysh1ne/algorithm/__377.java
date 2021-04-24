package com.wysh1ne.algorithm;

import java.util.*;

public class __377 {
    static class Solution {
        static int count = 0;
        public static int combinationSum4(int[] nums, int target) {
            Arrays.sort(nums);
            List<Integer> tmp = new ArrayList<>();
            tmp.add(nums[0]);
            recursive(nums, 0, tmp, target);
            return count;
        }

        private static void recursive(int[] nums, int left, List<Integer> tmp, int remain) {
            if (left >= nums.length) {
                return;
            }
            remain -= nums[left];
            if (remain == 0) {
                count += calCount(tmp);
                return;
            }
            if (remain < 0) {
                tmp.remove(tmp.size() - 1);
                return;
            }
            tmp.add(nums[left]);
            recursive(nums, left, tmp, remain);
            tmp.remove(tmp.size() - 1);
            recursive(nums, left + 1, tmp, remain);
        }

        private static int calCount(List<Integer> tmp) {
            Map<Integer, Integer> numFrequencyMap = new HashMap<>();
            for (int num: tmp) {
                if (numFrequencyMap.containsKey(num)) {
                    numFrequencyMap.put(num, numFrequencyMap.get(num) + 1);
                    continue;
                }
                numFrequencyMap.put(num, 1);
            }
            int res = 1;
            res *= getJieCheng(tmp.size());
            for (int frequency: numFrequencyMap.values()) {
                res /= getJieCheng(frequency);
            }
            return res;
        }

        private static int getJieCheng(int size) {
            if (size <= 1) {
                return size;
            }
            int res = 1;
            for (int i = size; i > 1; i--) {
                res *= i;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Solution.combinationSum4(nums, 4));
    }
}
