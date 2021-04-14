package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-10
 **/

public class __234 {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return true;
            }
            ListNode fast = head, slow = head;
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
                if (fast == null) {
                    break;
                }
                fast = fast.next;
            }
            slow = reverse(slow);
            fast = head;
            while (slow != null && fast != null) {
                if (slow.val != fast.val) {
                    return false;
                }
                slow = slow.next;
                fast = fast.next;
            }
            return true;
        }

        private ListNode reverse(ListNode slow) {
            ListNode pre = null, cur = slow;
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }
    }
}
