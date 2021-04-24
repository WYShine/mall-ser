package com.wysh1ne.algorithm;

import java.util.ArrayList;
import java.util.List;

public class __54 {
    static class Solution {
        public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
            while (true) {
                if (left > right || top > bottom) {
                    break;
                }
                for (int i = left; i <= right; i++) {
                    res.add(matrix[top][i]);
                }
                if (++top > bottom) {
                    break;
                }
                for (int i = top; i <= bottom; i++) {
                    res.add(matrix[i][right]);
                }
                if (--right < left) {
                    break;
                }
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                if (--bottom < top) {
                    break;
                }
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                if (++left > right) {
                    break;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(Solution.spiralOrder(matrix));
    }
}
