package com.wysh1ne.algorithm;

public class __87 {
    class Solution {
        public boolean isScramble(String s1, String s2) {
            int length1 = s1.length();
            int length2 = s2.length();
            if (length1 != length2) {
                return false;
            }
            if (s1.equals(s2)) {
                return true;
            }
            int[] count = new int[26];
            for (int i = 0; i < length1; i++) {
                count[s1.charAt(i) - 'a']++;
            }
            for (int i = 0; i < length2; i++) {
                count[s2.charAt(i) - 'a']--;
            }
            for (int i = 0; i < length1; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            for (int i = 1; i < length1; i++) {
                // s1 的 [0,i) 和 [i,n)
                String a = s1.substring(0, i), b = s1.substring(i);
                // s2 的 [0,i) 和 [i,n)
                String c = s2.substring(0, i), d = s2.substring(i);
                if (isScramble(a, c) && isScramble(b, d)) return true;
                // s2 的 [0,n-i) 和 [n-i,n)
                String e = s2.substring(0, length1 - i), f = s2.substring(length1 - i);
                if (isScramble(a, f) && isScramble(b, e)) return true;
            }
            return false;
        }
    }
}
