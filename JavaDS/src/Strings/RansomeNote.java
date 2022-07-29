package stringpractice;

import java.util.*;

public class RansomeNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> rNote = new HashMap();
        HashMap<Character, Integer> mNote = new HashMap();
        
        for(int i=0; i<ransomNote.length(); i++) {
            if(rNote.containsKey(ransomNote.charAt(i))) {
                rNote.put(ransomNote.charAt(i), rNote.getOrDefault(ransomNote.charAt(i), 0) + 1);
            } else {
                rNote.put(ransomNote.charAt(i), 1);
            }
        }
        
        for(int i=0; i<magazine.length(); i++) {
            if(mNote.containsKey(magazine.charAt(i))) {
                mNote.put(magazine.charAt(i), mNote.getOrDefault(magazine.charAt(i), 0) + 1);
            } else {
                mNote.put(magazine.charAt(i), 1);
            }
        }
        
        for (Map.Entry<Character,Integer> entry : rNote.entrySet()) {
            if(!mNote.containsKey(entry) || (mNote.containsKey(entry) && mNote.get(entry) != rNote.get(entry))) {
                return false;
            }
            System.out.println(entry);
        
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RansomeNote r = new RansomeNote();
		r.canConstruct("aa", "ab");
	}

}
