package com.wysh1ne.algorithm;

public class __5 {
    static class Solution {
        public static String longestPalindrome(String s) {
            char[] chars = s.toCharArray();
            int length = chars.length;
            if (length == 1) {
                return s;
            }
            boolean[][] dp = new boolean[length][length];
            for (int i = 0; i < length; i++) {
                dp[i][i] = true;
            }
            int maxLen = 1, start = 0;
            for (int len = 2; len <= length; len++) {
                for (int i = 0; i < length; i++) {
                    int j = len + i - 1;
                    if (j >= length) {
                        break;
                    }
                    if (chars[i] == chars[j]) {
                        if (len < 3) {
                            dp[i][j] = true;
                        } else {
                            dp[i][j] = dp[i + 1][j - 1];
                        }
                    } else {
                        dp[i][j] = false;
                    }
                    if (dp[i][j] && len > maxLen) {
                        maxLen = len;
                        start = i;
                    }
                }
            }
            return s.substring(start, start + maxLen);
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.longestPalindrome("babad"));
        System.out.println(Solution.longestPalindrome("cbbd"));
        System.out.println(Solution.longestPalindrome("a"));
        System.out.println(Solution.longestPalindrome("ac"));
    }
}
