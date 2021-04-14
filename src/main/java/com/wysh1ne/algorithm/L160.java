package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-07
 **/

public class L160 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode curA = headA;
            ListNode curB = headB;
            while (curA != curB) {
                curA = (curA == null) ? headB : curA.next;
                curB = (curB == null) ? headA : curB.next;
            }
            return curA;
        }
    }
}
