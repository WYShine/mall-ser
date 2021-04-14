package com.wysh1ne.algorithm;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-09
 **/

public class __20 {
    static class Solution {
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            Map<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('{', '}');
            map.put('[', ']');
            for (char c: chars) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                    continue;
                }
                if (stack.empty()) {
                    return false;
                }
                if (map.get(stack.pop()) != c) {
                    return false;
                }
            }
            return stack.empty();
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.isValid("()"));
        System.out.println(Solution.isValid("()[]{}"));
        System.out.println(Solution.isValid("(]"));
        System.out.println(Solution.isValid("([)]"));
        System.out.println(Solution.isValid("{[]}"));
    }
}
