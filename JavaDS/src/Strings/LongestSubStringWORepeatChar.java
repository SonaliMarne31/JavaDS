package Strings;
import java.util.*;

public class LongestSubStringWORepeatChar {
    // Time complexity : O(2n) = O(n)O(2n)=O(n)
    // Space complexity : O(min(m, n))O(min(m,n)).
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

    // Time - O(n)
    // Space complexity : O(min(m, n))O(min(m,n)).
    public int lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
		
		LongestSubStringWORepeatChar ls = new LongestSubStringWORepeatChar();
		
		int size = ls.lengthOfLongestSubstring("abcabcbb");
		
		System.out.println(size);

	}
}
