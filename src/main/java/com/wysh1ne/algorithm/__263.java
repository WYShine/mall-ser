package com.wysh1ne.algorithm;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-10
 **/

public class __263 {
    class Solution {
        public boolean isUgly(int n) {
            if (n <= 0) {
                return false;
            }
            while (n != 1) {
                boolean flag = false;
                if (n % 2 == 0) {
                    n /= 2;
                    flag = true;
                }
                if (n % 3 == 0) {
                    n /= 3;
                    flag = true;
                }
                if (n % 5 == 0) {
                    n /= 5;
                    flag = true;
                }
                if (!flag) {
                    return false;
                }
            }
            return true;
        }
    }
}
