package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-07
 **/

public class __21 {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            if (l2 == null) {
                return l1;
            }
            ListNode head, cur1 = l1, cur2 = l2, cur;
            if (cur1.val < cur2.val) {
                head = cur1;
                cur1 = cur1.next;
            } else {
                head = cur2;
                cur2 = cur2.next;
            }
            cur = head;
            while (cur1 != null && cur2 != null) {
                if (cur1.val < cur2.val) {
                    cur.next = cur1;
                    cur1 = cur1.next;
                } else {
                    cur.next = cur2;
                    cur2 = cur2.next;
                }
                cur = cur.next;
            }
            if (cur1 != null) {
                cur.next = cur1;
            }
            if (cur2 != null) {
                cur.next = cur2;
            }
            return head;
        }
    }
}
