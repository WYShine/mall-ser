package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-04
 **/

public class __1615 {
    class Solution {
        public int maximalNetworkRank(int n, int[][] roads) {
            int[][] connect = new int[n][n];
            int[] degree = new int[n];
            int length = roads.length;
            for (int i = 0; i < length; i++) {
                int second = roads[i][1];
                int first = roads[i][0];
                connect[first][second] = 1;
                connect[second][first] = 1;
                degree[first]++;
                degree[second]++;
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int tmp = degree[i] + degree[j] - connect[i][j];
                    max = Math.max(tmp, max);
                }
            }
            return max;
        }
    }
}
