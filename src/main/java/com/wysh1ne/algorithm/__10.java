package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-12
 **/

public class __10 {
    class Solution {
        public boolean isMatch(String s, String p) {
            char[] chars = s.toCharArray();
            char[] pattern = p.toCharArray();
            int lenStr = chars.length;
            int patternLen = pattern.length;
            boolean[][] dp = new boolean[lenStr][patternLen];
            dp[0][0] = true;
            return false;
        }
    }
}
