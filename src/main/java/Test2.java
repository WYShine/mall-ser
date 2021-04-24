import java.util.ArrayList;
import java.util.List;

public class Test2 {
    static List<Integer> res = new ArrayList<>();
    static boolean canJump = true;
    static List<Integer> moveTrace(int target) {
        res.add(0, target);
        if (target == 0) {
            return res;
        }
        if (target % 2 == 0 && canJump) {
            canJump = false;
            moveTrace(target / 2);
        } else {
            canJump = true;
            moveTrace(target - 1);
        }
        return res;
    }

    static List<Integer> moveTrace1(int target) {
//        System.out.println(target);
        res.add(0, target);
        if (target == 0) {
            return res;
        }
        if (target == 1) {
            res.add(0, 0);
            return res;
        }
        if (target % 2 == 0) {
            moveTrace1(target / 2);
        } else {
            List<Integer> list1 = new ArrayList<>(moveTrace1(target + 1));
            int index = list1.indexOf(target + 1);
            res = res.subList(index + 1, res.size());
            moveTrace1(target - 1);
            if (list1.size() < res.size()) {

                res = list1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(moveTrace1(0));
        res = new ArrayList<>();
        System.out.println(moveTrace1(1));
        res = new ArrayList<>();
        System.out.println(moveTrace1(2));
        res = new ArrayList<>();
        System.out.println(moveTrace1(3));
        res = new ArrayList<>();
        System.out.println(moveTrace1(5));

        res = new ArrayList<>();
        System.out.println(moveTrace1(8));
        res = new ArrayList<>();
        System.out.println(moveTrace1(15));
        res = new ArrayList<>();
        System.out.println(moveTrace1(20));

        res = new ArrayList<>();
        System.out.println(moveTrace1(23));
    }
}
