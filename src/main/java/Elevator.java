import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @project: mall-serv
 * @author: wangxin101
 * @create: 2021-04-06
 **/

public class Elevator {

    private final int high;
    private final int low;

    private int current;

    private boolean doorOpen;

    /**
     * 1 up, -1 down
     */
    private int direction;

    private boolean[] pressed;

    private final boolean[] allEmpty ;

    public Elevator(int high, int low) {
        this.high = high;
        this.low = low;
        this.current = low;
        pressed = new boolean[high - low + 1];
        allEmpty = new boolean[high - low + 1];;
    }

    public void run() {
        if (current == low) {
            direction = 1;
        }
        if (current == high) {
            direction = -1;
        }
        while (!Arrays.equals(pressed, allEmpty)) {
            int nearest = findDirectionNearest();
            if (nearest == Integer.MIN_VALUE) {
                current *= -1;
                nearest = findDirectionNearest();
            }
            moveTo(nearest);
        }
    }

    private void moveTo(int nearest) {
        current = nearest;
        pressed[getRealLevel(nearest)] = false;
    }

    private int findDirectionNearest() {
        for (int i = current; i < high - low + 1 && i >= 0; i += current) {
            if (pressed[getRealLevel(i)]) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void up(int level) {
        pressed[getRealLevel(level)] = true;
        this.run();
    }

    public void down(int level) {
        pressed[getRealLevel(level)] = true;
        this.run();
    }

    public void to(int level) {

    }

    public void close() {

    }

    public void open() {

    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    private int getRealLevel (int level) {
        return level - low;
    }
}
