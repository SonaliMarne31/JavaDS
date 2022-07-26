package Strings;

/* Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
 */
public class PalindromicSubstrings {

    // Sliding Window Approach 
    public int countSubstrings(String s) {
        
        int n = s.length();
        
        // Boundary case
        if(n==1) return 1;
        
        // Boundary case
        if(n==2) {
            if(s.charAt(0) == s.charAt(1)) return 3;
            return 2;
        }
        
        int count = n;
        
        // If string is beyond len = 2

        if(n>2) {
            // init size to 2
            int windowSize = 2;
            
            int i = 0;
            int j = windowSize-1;
            while(i <= j && j <= n) {
            	
            	if(j==n) {
            		windowSize++;
            		i=0;
            		j = windowSize-1;
            	} else {
            		if(panlindrome(s.substring(i, j+1))) {
                        count++;
                    }
                    j++;
                    i++;
            	}
            	
            	
            }
  
            
        }
        return count;
    }

    private boolean panlindrome(String str) {
		
		int i = 0;
		int j = str.length()-1;
		
		while(i<=j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
