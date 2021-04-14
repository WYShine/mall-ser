package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-07
 **/

public class __121 {
    static class Solution {
        public static int maxProfit(int[] prices) {
            int length = prices.length;
            int[] hold = new int[length];
            int[] notHold = new int[length];
            hold[0] = -prices[0];
            for (int i = 1; i < length; i++) {
                hold[i] = Math.max(hold[i - 1], notHold[i - 1] - prices[i]);
                notHold[i] = Math.max(notHold[i - 1], hold[i] + prices[i]);
            }
            return notHold[length - 1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(Solution.maxProfit(nums));
    }
}
