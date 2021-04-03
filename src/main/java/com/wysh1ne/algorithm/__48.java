package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-01
 **/

public class __48 {
    static class Solution {
        public static void rotate(int[][] matrix) {
            int length = matrix.length;
            int mid = length / 2;
            for (int i = 0; i < mid; i++) {
                int odd = 0;
                if (length % 2 != 0) {
                    odd = 1;
                }
                for (int j = 0; j < mid + odd; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[length - 1 - j][i];
                    matrix[length - 1 - j][i] = matrix[length - 1 - i][length - 1 - j];
                    matrix[length - 1 - i][length - 1 - j] = matrix[j][length - 1 - i];
                    matrix[j][length - 1 - i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        Solution.rotate(matrix);
        System.out.println(JsonUtils.toJson(matrix));
    }
}
