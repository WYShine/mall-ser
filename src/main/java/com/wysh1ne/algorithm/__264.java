package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-11
 **/

public class __264 {
    class Solution {
        public int nthUglyNumber(int n) {
            int[] dp = new int[n + 1];
            dp[1] = 1;
            int p2 = 1, p3 = 1, p5 = 1;
            for (int i = 2; i <= n; i++) {
                int tmp2 = dp[p2] * 2, tmp3 = dp[p3] * 3, tmp5 = dp[p5] * 5;
                int min = Math.min(tmp2, Math.min(tmp3, tmp5));
                dp[i] = min;
                if (tmp2 == min) {
                    p2++;
                }
                if (tmp3 == min) {
                    p3++;
                }
                if (tmp5 == min) {
                    p5++;
                }
            }
            return dp[n];
        }
    }
}
