package Queues;

import java.util.*;

public class DequeImpl {

    // O(Nk) where N is number of elements in array
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        
        int [] output = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i + k; j++) 
                max = Math.max(max, nums[j]);
            output[i] = max;
        }
        return output;
    }
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[i] > nums[queue.getLast()]) {
                queue.removeLast();
            }
            
            queue.addLast(i);
            
            System.out.println(" i = "+i + " " +queue.getFirst());
            if (queue.getFirst() + k == i) {
                queue.removeFirst();
            }
            
            if (i >= k - 1) {
                ans[i - k + 1] = nums[queue.getFirst()];
            }
        }
        
        return ans;
    }


    public static void main(String[] args) {
        DequeImpl d = new DequeImpl();
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = d.maxSlidingWindow(nums, k);
        for(int i=0; i<ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }


}
