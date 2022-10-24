package Arrays;

public class LongestIncresingSubArr {

    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = 1;

        for(int i = 1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                count++;
                max = Math.max(count, max);
            }
            else{
                count = 1;
            }
        }

        return Math.max(count, max);
    }

    public static void main(String[] aStrings) {
        LongestIncresingSubArr m = new LongestIncresingSubArr();
        int[] arr = new int[] {1,3,5,4,7};

        int result = m.findLengthOfLCIS(arr);
        System.out.println(result);
    }
    
}
