package Strings;

import java.util.HashMap;

public class MinWindowSubstring {

	
	public String minWindow(String s, String t) {
        
        int m = s.length();
        int n = t.length();
        
        if(n>m) return "";
        
        int windowSize = n; // init this as min window size needed to find t in s
        
        int i = 0;
        int ptr = 0;
        boolean isBroken = false;
        
        while(i <= (m-windowSize+1)) {
        	isBroken = false;
        	if(i> (m-windowSize)) {
            	windowSize += 1;
            	i = 0;
            } else {
	            String str = s.substring(i, windowSize+i);
	            for(int k = 0; k<n ; k++) {
	                char c = t.charAt(k);
	                if(str.indexOf(c) == -1) {
	                	isBroken = true;
	                    break;
	                }
	                ptr = k;
	            }
	            if(ptr+1==n && !isBroken) return str;
	            i++;
            }
            
        }
        
        return "";
    }
	
	
	public String minWindowHM(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        if(n > m) return "";
        if(m == 0 || n == 0) return "";
        
        int windowSize = n; // init this as min window size needed to find t in s
        
        HashMap<Character, Integer> tMap = new HashMap();
        for(int i=0 ; i<n ; i++) {
            char c = t.charAt(i);
            if(tMap.containsKey(c)) {
                tMap.put(c, tMap.getOrDefault(c, 0)+1);
            } else {
                tMap.put(c, 1);
            }
        }
        
         
        int i = 0;
        int ptr = 0;
        boolean isBroken = false;
        
        while(i <= (m-windowSize+1)) {
        	isBroken = false;
        	if(i> (m-windowSize)) {
            	windowSize += 1;
            	i = 0;
            } else {
	            String str = s.substring(i, windowSize+i);
                
                HashMap<Character, Integer> sMap = new HashMap();
                for(int j=0 ; j<str.length() ; j++) {
                    char c = str.charAt(j);
                    if(sMap.containsKey(c)) {
                        sMap.put(c, sMap.getOrDefault(c, 0)+1);
                    } else {
                        sMap.put(c, 1);
                    }
                }
                
	            for(int k = 0; k<n ; k++) {
	                char c = t.charAt(k);
	                if(sMap.getOrDefault(c, 0) >= tMap.getOrDefault(c, 0)) {
	                	isBroken = true;
	                    break;
	                }
	                ptr = k;
	            }
	            if(ptr+1==n && !isBroken) return str;
	            i++;
            }
            
        }
        
        
        
        return "";
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinWindowSubstring m = new MinWindowSubstring();
		System.out.println(m.minWindowHM(
				"aaaaaaaaaaaabbbbbcdd", "abcdd"));
	}

}
