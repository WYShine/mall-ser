package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class __102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) {
                return new ArrayList<>();
            }
            List<List<Integer>> res = new ArrayList<>();
            List<TreeNode> levelNode = new ArrayList<>();
            levelNode.add(root);
            while (!levelNode.isEmpty()) {
                List<TreeNode> tmp = new ArrayList<>();
                List<Integer> resTmp = new ArrayList<>();
                for (TreeNode node: levelNode) {
                    resTmp.add(node.val);
                    if (node.left != null) {
                        tmp.add(node.left);
                    }
                    if (node.right != null) {
                        tmp.add(node.right);
                    }
                }
                res.add(resTmp);
                levelNode = tmp;
            }
            return res;
        }
    }
}
