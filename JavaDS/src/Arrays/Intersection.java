package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection {

	public void intersection(int[] nums1, int[] nums2) {
		Set<Integer> s1 = new HashSet<Integer>();
        for(int i=0; i<nums1.length ; i++) {
            s1.add(nums1[i]);
        }
        Set<Integer> s2 = new HashSet<Integer>();
        for(int i=0; i<nums2.length ; i++) {
            s2.add(nums2[i]);
        }
        
        s1.retainAll(s2);
        int arr[] = new int[s1.size()];
        int i = 0;
        for(int a : s1) {
            arr[i] = a;
            i++;
        }
        System.out.println(arr);
        
    }
	
	public static void main(String[] args) {
		
		Intersection obj = new Intersection();
		int[] nums1 = new int[]{ 1,2,2,1 }; 
		int[] nums2 = new int[]{ 2,2 };
		obj.intersection(nums1, nums2);

	}

}
