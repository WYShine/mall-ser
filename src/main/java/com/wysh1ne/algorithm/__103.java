package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class __103 {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            if (root == null) {
                return new ArrayList<>();
            }
            List<List<Integer>> res = new ArrayList<>();
            List<TreeNode> levelNode = new ArrayList<>();
            levelNode.add(root);
            int direction = 1;
            while (!levelNode.isEmpty()) {
                List<Integer> resTmp = new ArrayList<>();
                List<TreeNode> levelNodeTmp = new ArrayList<>();
                for (TreeNode node: levelNode) {
                    resTmp.add(node.val);
                    if (node.left != null) {
                        levelNodeTmp.add(node.left);
                    }
                    if (node.right != null) {
                        levelNodeTmp.add(node.right);
                    }
                }
                if (direction < 0) {
                    Collections.reverse(resTmp);
                }
                res.add(resTmp);
                levelNode = levelNodeTmp;
                direction *= -1;
            }
            return res;
        }
    }
}
