package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-08
 **/

public class __226 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return root;
            }
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.right = left;
            root.left = right;
            invertTree(left);
            invertTree(right);
            return root;
        }

        public TreeNode invertTree2(TreeNode root) {
            if (root == null) {
                return root;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                TreeNode left = node.left;
                TreeNode right = node.right;
                node.right = left;
                node.left = right;
                queue.offer(left);
                queue.offer(right);
            }
            return root;
        }
    }
}
