package Arrays;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
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
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        TwoSum t = new TwoSum();
        int[] res = t.twoSum(nums, target);
        for(int i: res) {
            System.out.println(res[i]);
        }
	}
}