package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-06
 **/

import com.wysh1ne.algorithm.common.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

public class __146 {
    static class LRUCache {
        int capacity;
        Map<Integer, ListNode> map;
        ListNode head;
        ListNode tail;
        int size;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            head = new ListNode();
            tail = new ListNode();
            head.next = tail;
            tail.pre = head;
            this.size = 0;
            map = new HashMap<>();
        }

        public int get(int key) {
            ListNode listNode = map.get(key);
            if (listNode == null) {
                return -1;
            }
            removeNode(listNode);
            add2Head(listNode);
            return listNode.val;
        }

        public void put(int key, int value) {
            ListNode listNode = map.get(key);
            if (listNode != null) {
                listNode.val = value;
                removeNode(listNode);
                add2Head(listNode);
                return;
            }
            size++;
            ListNode node = new ListNode(key, value);
            map.put(key, node);
            add2Head(node);
            if (size > capacity) {
                ListNode tail = removeTail();
                map.remove(tail.key);
                size--;
            }
        }

        private ListNode removeTail() {
            ListNode pre = tail.pre;
            pre.pre.next = tail;
            tail.pre = pre.pre;
            return pre;
        }

        private void add2Head(ListNode listNode) {
            ListNode next = head.next;
            head.next = listNode;
            listNode.pre = head;
            listNode.next = next;
            next.pre = listNode;
        }

        private void removeNode(ListNode listNode) {
            ListNode pre = listNode.pre;
            ListNode next = listNode.next;
            pre.next = next;
            next.pre = pre;
        }

        class ListNode {
            public int val;
            public int key;
            public ListNode next;
            public ListNode pre;
            public ListNode() {}
            public ListNode(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,0);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);
        lruCache.get(2);
        lruCache.put(4,4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }
}
