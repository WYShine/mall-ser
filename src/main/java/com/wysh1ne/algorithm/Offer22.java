package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-10
 **/

public class Offer22 {
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            int count = 0;
            ListNode cur = head;
            while (cur!= null) {
                count++;
                cur = cur.next;
            }
            cur = head;
            while (count - k > 0) {
                cur = cur.next;
                count--;
            }
            return cur;
        }
    }
}
