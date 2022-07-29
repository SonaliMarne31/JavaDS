package Strings;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortColors {
	
	public void sortColors(int[] nums) {
        int n = nums.length;
        TreeMap<Integer, Integer> cMap = new TreeMap();
        
        for(int i=0 ; i<n ; i++) {
            if(cMap.containsKey(nums[i])) {
                cMap.put(nums[i], cMap.getOrDefault(nums[i], 0) +1);
            } else {
                cMap.put(nums[i], 1);
            }
        }
        
        Set set = cMap.entrySet();  
		Iterator iterator=set.iterator();  
        int ptr = 0;
		while(iterator.hasNext()){
		    Map.Entry mapEntry=(Map.Entry)iterator.next(); 
            int k=0;
            Integer value = (Integer)mapEntry.getValue();
            while(k<value) {
                nums[ptr] = (int) mapEntry.getKey();
                ptr++;
                k++;
            }
            
		}  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
