package Strings;
import java.util.*;

public class LongestSubStringWORepeatChar {
    public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();
        int i = 0;
        int j = 0;
        
        Set<Character> set = new HashSet<Character>();
        int max = 0;
        
        // Input: s = "abcabcbb"
        // Output: 3
        // Explanation: The answer is "abc", with the length of 3.

        while(i<len) {
            
            char c = s.charAt(i);
            
            // if char is in set, remove and  incr j
            while(set.contains(c)) {
                char pop = s.charAt(j);
                set.remove(pop);
                j++;
            } 
            set.add(c);
            
            max = Math.max(max, i-j+1);
            i++;
        }
       
        return max;
        
    }

    public static void main(String[] args) {
		
		LongestSubStringWORepeatChar ls = new LongestSubStringWORepeatChar();
		
		int size = ls.lengthOfLongestSubstring("abcabcbb");
		
		System.out.println(size);

	}
}
