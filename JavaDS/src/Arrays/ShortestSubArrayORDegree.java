package Arrays;

import java.util.Collections;
import java.util.HashMap;

public class ShortestSubArrayORDegree {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,2,3,1,4,2};
        System.out.println(ShortestSubArrayORDegree.shortestSubArr(nums));
    }

    public static int shortestSubArr(int[] nums) {
        // store freq count
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        // store latest index of the key
        HashMap<Integer, Integer> right = new HashMap<Integer, Integer>();
        // store first occurence of the key
        HashMap<Integer, Integer> left = new HashMap<Integer, Integer>();


        for(int i=0; i<nums.length ; i++) {

            count.put(nums[i] , count.getOrDefault(nums[i], 0) + 1);

            if(left.get(nums[i]) == null) {
                left.put(nums[i], i);
            }
            right.put(nums[i], i);

        }

        int degree = Collections.max(count.values());
        int min = Integer.MAX_VALUE;

        for (int key : count.keySet()) {
            if(count.get(key) == degree) {
                min = Math.min(min, right.get(key) -left.get(key) + 1);

            }
        }

        return min;
    }
}
