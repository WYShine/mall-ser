public class Test1 {
    public static int solution(int[] A, int M) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int[] remainderCount = new int[M];
        int max = 1;
        for (int i = 0; i < A.length; i++) {
            int num = A[i];
            int inArea = num;
            if (num < 0) {
                int abs = Math.abs(num);
                if (abs > M) {
                    inArea = (-1 * (num / M)) * M + num;
                }
                inArea = inArea + M;
            } else {
                inArea = num - (M * (num / M));
            }
            remainderCount[inArea]++;
            max = Math.max(remainderCount[inArea], max);
        }
        return max;
    }

    public static int area(int num, int target) {
        return num - (target * (num / target));
    }

    public static void main(String[] args) {
        int[] nums = {-10000, 10000};
        System.out.println(solution(nums, 1000));
    }
}
