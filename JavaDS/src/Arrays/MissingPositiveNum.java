package Arrays;
import java.util.*;

public class MissingPositiveNum {
    public static int firstMissingPositive(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        // Get all the numbs in array to a HashMap
        for(int i = 0; i<nums.length; i++) {
            hm.put(nums[i], i);
        }
        
        int smallest = 1;
        int size = hm.size();
        int j = 0;
        
        while(j<size) {
            // if hashmap has the smallest value, we are good, so increase it
            if(hm.containsKey(smallest)) {
                smallest++;
            } else {
                // if HM does not have, this means we got the missing positive number, so return it
                return smallest++;
            }
            
            j++;
        }
        return smallest;
    }

    public static void main(String args[]) {
        int[] arr = new int[] {1,2,0};
        int j = MissingPositiveNum.firstMissingPositive(arr);
        System.out.println("First missing positive num:  "+j);
    }
}
