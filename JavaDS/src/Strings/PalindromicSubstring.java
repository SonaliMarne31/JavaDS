package Strings;

public class PalindromicSubstring {
	
	public int countSubstrings(String s) {
        
        int n = s.length();
        
        if(n==1) return 1;
        
        if(n==2) {
            if(s.charAt(0) == s.charAt(1)) return 3;
            return 2;
        }
        
        int count = n;
        
        if(n>2) {
            int windowSize = 2;
            
            int i = 0;
            int j = windowSize-1;
            while(i <= (j-windowSize+1) && j<=n) {
            	
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

	public static void main(String[] args) {
		
		
		PalindromicSubstring p = new PalindromicSubstring();
		System.out.println(p.countSubstrings("aaa"));

	}

}
