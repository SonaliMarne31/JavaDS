package Arrays;
import java.util.*;

public class RemoveDupsFromSortedArr {
    public static int removeDuplicates(int[] nums) {
        // Sorted Set interface = A set to provide a particular ordering on its elements
        // Either natural order or using a comparator
        SortedSet<Integer> set = new TreeSet<Integer>();
        for(int i=0 ; i<nums.length; i++) {
            set.add(nums[i]);
        }
        int j=0;
        for (int s : set) { 
            nums[j] = s;
            j++;
        }
       return j;
    }

    public static void main(String args[]) {
        int[] arr = new int[] {0,0,1,1,1,2,2,3,3,4};
        int j = RemoveDupsFromSortedArr.removeDuplicates(arr);
        System.out.println("J "+j);
    }
}
