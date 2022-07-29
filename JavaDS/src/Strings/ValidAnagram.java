package Strings;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		
		String s = "anagram";
		String t = "nagaram";
		
		
		char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        String ss = String.valueOf(sChar);
        
        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
        String tt = String.valueOf(tChar);
		
		System.out.println("ss "+ss + " tt "+tt);
		
		System.out.println(isPalin(" "));

	}

	private static boolean isPalin(String str) {
		String s = str.replaceAll("[^a-zA-Z0-9]", "");
        
        if(s.length() == 1) return true;
        if(s.length() <= 0) return false;
        
        
        int i = 0;
        int j = s.length() - 1;
        boolean isPalin = true;
        while(i<=j) {
            if(s.charAt(i) != s.charAt(j)) {
                isPalin = false;
                break;
            }
            i++;
            j--;           
        }
        return isPalin;
	}

}
