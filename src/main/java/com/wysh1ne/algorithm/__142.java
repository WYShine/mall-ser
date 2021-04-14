package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class __142 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && slow != null) {
                slow = slow.next;
                fast = fast.next;
                if (fast == null) {
                    return null;
                }
                fast = fast.next;
                if (fast == slow) {
                    if (fast == null) {
                        return null;
                    }
                    fast = head;
                    break;
                }
            }
            while (fast != slow && fast != null && slow != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
    }
}
