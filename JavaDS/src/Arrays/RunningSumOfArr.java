package Arrays;

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

public class RunningSumOfArr {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0 ; i< nums.length ; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        
        return ans;
    }
}
