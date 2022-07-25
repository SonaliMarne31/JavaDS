package Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        
        int min = 0;
        int max = nums.length-1;
        
        if(min > max){
            return -1;
        }

        while(min<=max) {
            int mid = (min + max)/2;

            if(target == nums[mid]){
                return mid;
            }

            if(target > nums[mid]){
                min = mid + 1;
            } else {
                max = mid - 1;
            }

        }
        return -1;
    }
}
