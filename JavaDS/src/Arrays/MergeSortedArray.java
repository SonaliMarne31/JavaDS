package Arrays;
import java.util.*;

public class MergeSortedArray {
	
    // Time complexity: O(n+m).
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Set p1 and p2 to point to the end of their respective arrays.
        int p1 = m - 1;
        int p2 = n - 1;
        
        // And move p backwards through the array, each time writing
        // the smallest value pointed at by p1 or p2.
        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
        }
    }

    // Time complexity:O(n + m)
    // Space complexity: O(n), but it can vary.
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

	public static void main(String[] args) {
		
		
		MergeSortedArray m = new MergeSortedArray();
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		
		m.merge(nums1, 3, nums2, 3);

	}

}
