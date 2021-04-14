package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-07
 **/

import com.wysh1ne.algorithm.common.JsonUtils;
import com.wysh1ne.algorithm.common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class __25 {
    static class Solution {
        public static ListNode reverseKGroup(ListNode head, int k) {
            int count = 0;
            ListNode cur = head;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode pre = dummy;
            ListNode latter;
            for (int i = 0; i < count / k; i++) {
                latter = pre;
                int index = 0;
                while (index < k) {
                    latter = latter.next;
                    index++;
                }
                latter = latter.next;
                ListNode[] res = reverse(pre, latter);
                pre.next = res[0];
                res[1].next = latter;
                pre = res[1];
            }
            return dummy.next;
        }

        public static ListNode[] reverse(ListNode pre, ListNode latter) {

            ListNode cur = pre.next;
            ListNode before = null;
            while (cur != latter) {
                ListNode tmp = cur.next;
                cur.next = before;
                before = cur;
                cur = tmp;
            }
            return new ListNode[]{before, pre.next};
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head = ListNode.fromArray(nums);
        System.out.println(JsonUtils.toJson(Solution.reverseKGroup(head, 2)));
    }
}
