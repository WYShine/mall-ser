package com.wysh1ne.algorithm;

import java.util.Stack;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-08
 **/

public class Offer09 {
    static class CQueue {
        Stack<Integer> inStack;
        Stack<Integer> outStack;

        public CQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void appendTail(int value) {
            inStack.push(value);
        }

        public int deleteHead() {
            if (outStack.empty()) {
                while (!inStack.empty()) {
                    Integer pop = inStack.pop();
                    outStack.push(pop);
                }
            }
            if (outStack.empty()) {
                return -1;
            }
            return outStack.pop();
        }
    }
}
