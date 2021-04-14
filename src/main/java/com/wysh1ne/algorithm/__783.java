package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.TreeNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-13
 **/

public class __783 {
    class Solution {
        int min = Integer.MAX_VALUE;
        TreeNode pre = null;
        public int minDiffInBST(TreeNode root) {
            if (root == null) {
                return 0;
            }
            dfs(root);
            return min;
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            if (pre == null) {
                pre = root;
            } else {
                min = Math.min(min, Math.abs(pre.val - root.val));
            }
            pre = root;
            dfs(root.right);
        }
    }
}
