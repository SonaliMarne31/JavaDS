package Arrays;

public class MaxSumSubArr {
    public static void main(String[] aStrings) {
        MaxSumSubArr m = new MaxSumSubArr();
        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};

        int result = m.maxSubArr(arr);
        System.out.println(result);
    }

    private int maxSubArr(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE ,sum=0;
        if(len==1) return nums[0];
        
        for(int i=0;i<len;i++){
            
            sum += nums[i];
            sum = Math.max(sum, nums[i]);
            max = Math.max(max, sum);
            
        }
        return max;
    }
}
