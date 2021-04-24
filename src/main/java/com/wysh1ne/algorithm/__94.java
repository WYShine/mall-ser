package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class __94 {
    class Solution {
        List<Integer> res = new ArrayList<>();
        public List<Integer> inorderTraversal(TreeNode root) {
            dfs(root);
            return res;
        }

        private void dfs(TreeNode root) {
            if (root == null) {
                return;
            }
            dfs(root.left);
            res.add(root.val);
            dfs(root.right);
        }

        /**
         * 模拟递归
         * @param root
         * @return
         */
        public List<Integer> inorderTraversal2(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            while (root != null) {

            }
            return null;
        }
    }
}
