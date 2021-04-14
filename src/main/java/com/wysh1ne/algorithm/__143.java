package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;
import com.wysh1ne.algorithm.common.ListNode;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-10
 **/

public class __143 {
    static class Solution {
        public static void reorderList(ListNode head) {
            ListNode fast = head, slow = head;
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
                if (fast == null) {
                    break;
                }
                fast = fast.next;
            }
            ListNode cutPoint = slow;
            slow = reverse(slow);
            ListNode cur = head;
            while (slow != null) {
                ListNode next = cur.next;
                ListNode single = slow;
                slow = slow.next;
                single.next = null;
                cur.next = single;
                single.next = next;
                cur = next;
            }
            cur.next = null;
        }

        private static ListNode reverse(ListNode slow) {
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

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ListNode listNode = ListNode.fromArray(nums);
        Solution.reorderList(listNode);
        System.out.println(JsonUtils.toJson(listNode));
    }
}
