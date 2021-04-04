package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-03
 **/

public class __173 {
    class BSTIterator {
        Queue<Integer> queue = new LinkedList<Integer>();

        public BSTIterator(TreeNode root) {
            init(root);
        }

        private void init(TreeNode root) {
            if (root == null) {
                return;
            }
            init(root.left);
            queue.offer(root.val);
            init(root.right);
        }

        public int next() {
            return queue.poll();
        }

        public boolean hasNext() {
            return !queue.isEmpty();
        }
    }
}
