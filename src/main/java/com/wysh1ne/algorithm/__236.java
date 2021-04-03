package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.TreeNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-01
 **/

public class __236 {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if(left == null) return right;
            if(right == null) return left;
            return root;
        }

        public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if(left == null && right == null) return null; // 1.
            if(left == null) return right; // 3.
            if(right == null) return left; // 4.
            return root; // 2. if(left != null and right != null)
        }
    }
}
