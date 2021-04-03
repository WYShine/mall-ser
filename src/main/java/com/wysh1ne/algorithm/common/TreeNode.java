package com.wysh1ne.algorithm.common;

import lombok.AllArgsConstructor;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-01
 **/
@AllArgsConstructor
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
}
