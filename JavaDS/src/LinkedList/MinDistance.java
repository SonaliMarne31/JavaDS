package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class MinDistance {
	public int min(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        if (b <= a && b <= c) return b;
        return c;
    }
    
    public int getMinDist(String s1, String s2, int m, int n) {
        
        if(m == 0) return n;
        
        if(n == 0) return m;
        
        if(s1.charAt(m-1) == s2.charAt(n-1)) {
            getMinDist(s1, s2, m-1, n-1);
        }
        
        return min(
            getMinDist(s1, s2, m, n-1), // insert
            getMinDist(s1, s2, m-1, n), // delete
            getMinDist(s1, s2, m-1, n-1) // replace
        ) + 1;
    }
    
    public int minDistance(String word1, String word2) {
    	
        int m = word1.length();
        int n = word2.length();

        if (word1 == null || word1.isEmpty())
            return word2 == null ? 0 : n;

        if (word2 == null || word2.isEmpty())
            return m;

        if (word1.charAt(0) == word2.charAt(0)) {
            return minDistance(word1.substring(1), word2.substring(1));
        }

        int insertOp = minDistance(word1, word2.substring(1));
        int deleteOp = minDistance(word1.substring(1), word2);
        int replaceOp = minDistance(word1.substring(1), word2.substring(1));

        return 1 + Math.min(insertOp, Math.min(deleteOp, replaceOp));
    }
    
    public static void main(String args[]) {
    	MinDistance m = new MinDistance();
    	String s1 = "cat";
    	String s2 =  "cut";
    	int n = m.minDistance(s1, s2);
    	System.out.println("count : "+ n);
    	
    	String s = "s";
    	System.out.println("sub: "+ s.substring(1));
    	
    	
    }
}
