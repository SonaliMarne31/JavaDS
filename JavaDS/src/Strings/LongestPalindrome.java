package Strings;

import java.util.*;

public class LongestPalindrome {
	public static int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (int i=0 ; i < s.length() ;  i++) {
            if(set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        if(set.size() <= 1) return s.length();
        return s.length() - set.size() + 1;
    }
	public static void main(String[] args) {
		longestPalindrome("abccccdd");

	}

}
