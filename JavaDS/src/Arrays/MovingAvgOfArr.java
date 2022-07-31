package Arrays;
import java.util.*;

public class MovingAvgOfArr {
    // O(n)
    private int size;
    List<Integer> queue = new ArrayList<Integer>();
    
    public MovingAvgOfArr(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        queue.add(val);
        int windowSum = 0;
        
        for(int i= Math.max(0, queue.size() - size); i< queue.size(); i++) {
            windowSum += (int)queue.get(i);    
        }
        return windowSum * 1.0 / Math.min(size, queue.size());
    }

    public static void main(String args[]) {
        MovingAvgOfArr movingAverage = new MovingAvgOfArr(3);
        System.out.println(movingAverage.next(1)); // return 1.0 = 1 / 1
        System.out.println(movingAverage.next(10)); // return 5.5 = (1 + 10) / 2
        System.out.println(movingAverage.next(3)); // return 4.66667 = (1 + 10 + 3) / 3
        System.out.println(movingAverage.next(5)); // return 6.0 = (10 + 3 + 5) / 3
    }
}
