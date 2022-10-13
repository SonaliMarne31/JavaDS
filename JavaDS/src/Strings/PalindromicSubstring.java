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

	// O(N2)
	public int countSubstringsDP(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        
        int count = 0;
        for(int g=0; g<n; g++) {
            for(int i=0, j=g; j<n; i++, j++) {
                if(g == 0) {
                    dp[i][j] = true; //if one char it is pallindrome
                } else if(g == 1) {
                    dp[i][j] = s.charAt(i) == s.charAt(j); //if two char need to check if same or not
                } else {
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) { //we will compare start and end char and mid par to be pallindrome
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                }
                
                if(dp[i][j]) count++;
            }
        }
            
        return count;
    }

	public static void main(String[] args) {
		
		
		PalindromicSubstring p = new PalindromicSubstring();
		System.out.println(p.countSubstrings("aaa"));

	}

}
