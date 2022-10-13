package Arrays;
import java.util.HashMap;

class TwoSumRotatedArr {
    public boolean twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0; i< nums.length; i++) {
           hm.put(nums[i], i);
        }
        int[] res = new int[2];
        for(int i=0; i< nums.length; i++) {
            int compliment = target - nums[i];
            if(hm.containsKey(compliment) && hm.get(compliment) != i) {
                res[0] = i;
                res[1] = hm.get(compliment);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {11, 15, 6, 8, 9, 10};
        int target = 16;
        TwoSumRotatedArr t = new TwoSumRotatedArr();
        boolean res = t.twoSum(nums, target);
        System.out.println(" Is Pair : " + res);
	}
}