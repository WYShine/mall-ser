package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-01
 **/

public class __206 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null, current = head;
            while (current != null) {
                ListNode tmp = current.next;
                current.next = pre;
                pre = current;
                current = tmp;
            }
            return pre;
        }
    }
}
