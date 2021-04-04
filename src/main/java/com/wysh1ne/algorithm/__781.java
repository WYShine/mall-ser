package com.wysh1ne.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-04
 **/

public class __781 {
    static class Solution {
        public static int numRabbits(int[] answers) {
            Map<Integer, Integer> numCountMap = new HashMap<>();
            for (int answer: answers) {
                Integer count = numCountMap.getOrDefault(answer, 0);
                numCountMap.put(answer, count + 1);
            }
            int res = 0;
            for (Map.Entry<Integer, Integer> entry: numCountMap.entrySet()) {
                int answer = entry.getKey();
                int count = entry.getValue();
                res += (count / (answer + 1)) * (answer + 1);
                if (count % (answer + 1) > 0) {
                    res += answer + 1;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10,10,10};
        System.out.println(Solution.numRabbits(nums));
    }
}
