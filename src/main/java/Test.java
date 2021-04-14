import com.sun.rowset.internal.Row;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-13
 **/

public class Test {
    public static int maxMultiplySubArray(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int[] dpMax = new int[length];
        int[] dpMin = new int[length];
        int num0 = nums[0];
        dpMax[0] = num0;
        dpMin[0] = num0;
        int max = num0;
        for (int i = 1; i < length; i++) {
            int num = nums[i];
            dpMax[i] = Math.max(num, Math.max(dpMax[i - 1] * num, dpMin[i - 1] * num));
            dpMin[i] = Math.min(num, Math.min(dpMax[i - 1] * num, dpMin[i - 1] * num));
            max = Math.max(dpMax[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,-2,1};
        System.out.println(maxMultiplySubArray(nums));
    }

    public static void bubbleSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
