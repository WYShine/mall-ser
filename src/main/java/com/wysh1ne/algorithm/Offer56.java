package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-03
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
 **/

public class Offer56 {
    static class Solution {
        public static int singleNumber(int[] nums) {
            int[] binary = new int[32];
            for (int num: nums) {
                int mask = 1;
                int index = 0;
                while (num > 0) {
                    if ((mask & num) != 0) {
                        binary[index]++;
                    }
                    index++;
                    num >>= 1;
                }
            }
            int res = 0;
            for (int i = 0; i < binary.length; i++) {
                res += ((binary[i] % 3) << i);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] nums = {9,1,7,9,7,9,7};
        System.out.println(Solution.singleNumber(nums));
    }
}
