package com.wysh1ne.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-04
 **/

public class __1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i< nums.length; i++) {
                if(map.containsKey(target - nums[i])) {
                    return new int[] {map.get(target-nums[i]),i};
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
}
