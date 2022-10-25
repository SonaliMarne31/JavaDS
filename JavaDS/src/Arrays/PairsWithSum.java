package Arrays;

import java.util.HashMap;
import java.util.*;
public class PairsWithSum {
    
    private static int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (m.containsKey(k - arr[i])) {
                count += m.get(k - arr[i]);
            }
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else {
                m.put(arr[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] a) {
        int[] arr = new int[] {1, 5, 7, -1, 5};
        int count = PairsWithSum.countPairs(arr, 6);
        System.out.println(count);
    }
}
