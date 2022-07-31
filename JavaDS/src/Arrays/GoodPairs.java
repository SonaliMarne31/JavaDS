package Arrays;
import java.util.*;;

/*
 *  Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    Example 1:
    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        int ans = 0;
        for(int n : nums) {
            ans += map.getOrDefault(n, 0);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return ans;
    }

    public static void main(String args[]) {
        int[]  nums = new int[]{1, 2, 3, 1, 1, 3};
        System.out.println(GoodPairs.numIdenticalPairs(nums));
    }
}
