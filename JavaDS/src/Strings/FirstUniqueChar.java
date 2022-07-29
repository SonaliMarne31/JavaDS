package Strings;

import java.util.HashMap;

public class FirstUniqueChar {
	
	public int firstUniqChar(String s) {
        int index;
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for (int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            if (hash.containsKey(c)) {
                hash.put(c, hash.get(c) + 1);
            } else {
                hash.put(c, 1);
            }        
        }
        for (int i = 0; i<s.length() ; i++) {
            if(hash.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
	
	public static void main(String args[]){
		FirstUniqueChar f = new FirstUniqueChar();
		System.out.println(f.firstUniqChar("dddccdbba"));
	}
}
