package com.wysh1ne.algorithm;

import com.wysh1ne.algorithm.common.JsonUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-06
 **/

public class __3 {
    static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            if (s.length()==0) return 0;
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            int left = 0;
            for(int i = 0; i < s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    left = Math.max(left,map.get(s.charAt(i)) + 1);
                }
                map.put(s.charAt(i),i);
                max = Math.max(max,i-left+1);
            }
            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLongestSubstring("aab"));
        System.out.println(Solution.lengthOfLongestSubstring("123"));
        System.out.println(Solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(Solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(Solution.lengthOfLongestSubstring(" "));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(100,200);
        map.entrySet().removeIf(entry -> entry.getKey() >= 100);
        System.out.println(JsonUtils.toJson(map));
    }
}
