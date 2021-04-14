package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-10
 **/

public class __92 {
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode cur = dummy, leftNode = null, rightNode = null, leftPre = null, rightNext;
            int count = 0;
            while (count <= right) {
                if (count == left - 1) {
                    leftPre = cur;
                }
                if (count == left) {
                    leftNode = cur;
                }
                if (count == right) {
                    rightNode = cur;
                }
                count++;
                cur = cur.next;
            }
            rightNext = cur;
            cur = leftNode;
            ListNode pre = null;
            while (cur != rightNext) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            leftPre.next = rightNode;
            leftNode.next = rightNext;
            return dummy.next;
        }
    }
}
