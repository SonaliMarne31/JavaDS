package Strings;

public class ImplementStrStrNeedleHaystack {
    public static int strStr(String haystack, String needle) {
        
        // if needle is empty
        if(needle.length() <= 0) {
            return -1;
        }
        
        int m = haystack.length();
        int n = needle.length();
        
        // if haystack is less than needle, no way we can get needle
        if(m<n) return -1;
        
        // one char in both
        if(m==1 && n==1 && haystack.charAt(0) == needle.charAt(0)) return 0;
        

        // Sliding window approach
        int windowSize = m - n;
        
        for(int i=0 ; i<=windowSize; i++) {
            int ptr;
            for(ptr=0; ptr<n; ptr++) {
                if(haystack.charAt(i+ptr) != needle.charAt(ptr)) {
                    break;
                }
            }
            if(ptr==n) return i;
        }
        
        return -1;
        
    }

    public static void main(String[] args) {
		int output = ImplementStrStrNeedleHaystack.strStr("hello", "ll");
        System.out.println(output);
	}
}
