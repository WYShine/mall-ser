package com.wysh1ne.algorithm;

import java.util.Stack;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-10
 **/

public class __155 {
    class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minValStack;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            minValStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (minValStack.empty()) {
                minValStack.push(val);
                return;
            }
            minValStack.push(Math.min(val, minValStack.peek()));
        }

        public void pop() {
            minValStack.pop();
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minValStack.peek();
        }
    }
}
