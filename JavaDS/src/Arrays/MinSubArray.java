package Arrays;

public class MinSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        
        
        int i=0;
        int j=0;
        
        int min = nums.length-1;
        
        while(j<=i && i!=nums.length-1) {
            int val = 0;
            while(val<= target && i != nums.length-1) {
                
                val += nums[i];
                i++;
            }
            min = Math.min(min, i-j+1);
            j++;
            i=j;
            
        }
        
        return min;
        
    }

    public static void main(String[] aStrings) {
        MinSubArray m = new MinSubArray();
        int[] arr = new int[] {2,3,1,2,4,3};

        int result = m.minSubArrayLen(7, arr);
        System.out.println(result);
    }
}
