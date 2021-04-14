package com.wysh1ne.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-12
 **/

public class __179 {
    class Solution {
        public String largestNumber(int[] nums) {
            List<Integer> collect = Arrays.stream(nums).boxed()
                    .sorted((o1, o2) -> (o2 + "" + o1).compareTo(o1 + "" + o2)).collect(Collectors.toList());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < collect.size(); i++) {
                Integer num = collect.get(i);
                if (i == 0 && num == 0) {
                    return 0 + "";
                }
                sb.append(num);
            }
            return sb.toString();
        }
    }
}
