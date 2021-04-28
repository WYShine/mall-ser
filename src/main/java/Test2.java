
public class Test2 {
    static String minSubNum(String origin, int m) {
        int length = origin.length();
        StringBuilder sb = new StringBuilder();
        int toRemainCount = length - m;
        int leftBoard = -1;
        while (toRemainCount > 0) {
            int min = 10;
            int tmpLeftBoard = leftBoard;
            for (int i = length - toRemainCount; i > leftBoard; i--) {
                int charAtNum = origin.charAt(i) - '0';
                if (charAtNum > min) {
                    continue;
                }
                if (toRemainCount != length - m || charAtNum != 0) {
                    min = charAtNum;
                    tmpLeftBoard = i;
                }
            }
            leftBoard = tmpLeftBoard;
            sb.append(min);
            toRemainCount--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(minSubNum("23198", 2));
        System.out.println(minSubNum("123198", 2));
    }
}
