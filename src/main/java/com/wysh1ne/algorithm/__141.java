package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class __141 {
    public class Solution {
        public boolean hasCycle(ListNode head) {

            ListNode fast = head;
            ListNode slow = head;
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
                if (fast == null) {
                    return false;
                }
                fast = fast.next;
                if (fast == slow) {
                    return true;
                }
            }
            return false;
        }
    }
}
