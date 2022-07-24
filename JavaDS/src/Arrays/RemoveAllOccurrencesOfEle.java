package Arrays;

public class RemoveAllOccurrencesOfEle {
    public static int removeElement(int[] nums, int val) {
        
       
        int j = 0;
        // Scan all arr elements 
        for(int i=0 ;i<nums.length; i++) {
            // if no match then reshuffle the array using j index
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
   
        for(int i: nums) {
            System.out.println(i);
        }
        return j;
        
    }
    public static void main(String args[]) {
        int[] arr = new int[] {3,2,2,3};
        int j = RemoveAllOccurrencesOfEle.removeElement(arr, 3);
        System.out.println("J "+j);
        
    }
    
}
