package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWORepeat {
	
	public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        int i = 0;
        int j = 0;
        
        Set<Character> set = new HashSet();
        
        while(i<len) {
            
            char c = s.charAt(i);
            
            if(!set.contains(c)) {
                set.add(c);
                i++;
            } else {
            	char pop = s.charAt(j);
                set.remove(pop);
                j++;
            }
        }
       
        return set.size();
        
    }

	public static void main(String[] args) {
		
		
		LongestSubstringWORepeat ls = new LongestSubstringWORepeat();
		
		
		int size = ls.lengthOfLongestSubstring("abcabcbb");
		
		System.out.println(size);

	}

}
