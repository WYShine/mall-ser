package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.TreeNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-03
 **/

public class __543 {
    static class Solution {
        static int max = 0;
        public static int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
            return max - 1;
        }

        public static int dfs(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = dfs(root.left);
            int right = dfs(root.right);
            max = Math.max(max, left + right + 1);
            return Math.max(left, right) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(Solution.dfs(root));
        System.out.println();
    }
}
