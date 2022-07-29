package Strings;
import java.util.*;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {
        
        String smallest = new String();
        smallest = strs[0];
        int smallestIdx = 0;
        
        List<String> list = new ArrayList<String>(Arrays.asList(strs));
        
        
        for(int i=1; i<strs.length; i++) {
            // smallest = smallest.length() < strs[i].length() ? smallest : strs[i];
            smallestIdx = smallest.length() <= strs[i].length() ? smallestIdx : i;
            smallest = list.get(smallestIdx);
        }
        
        int j = 0;
        int end = 0 ;
        
        smallest = list.get(smallestIdx);
        System.out.println("Smallest string : "+ smallest);
        
        list.remove(smallest);
        
        outerloop:
        while(j<smallest.length()) {
            for(int k=0; k<list.size(); k++) {
                String str = list.get(k);
                if(str.charAt(j) != smallest.charAt(j)) {
                    end = j;
                    break outerloop;
                }
            }
            j++;
        }
        
        return smallest.substring(0, end);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestCommonPrefix lp = new LongestCommonPrefix();
		String[] str = new String[]{"dog","racecar","car"};
		String[] str1 = new String[]{"flower","flow","flight"};
		String[] str2 = new String[]{"ab", "a"};
		
		String substr = lp.longestCommonPrefix(str2);
		System.out.println("Substring " + substr);

	}

}
