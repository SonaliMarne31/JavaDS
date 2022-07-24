package Strings;
import java.util.*;
public class Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> finalList = new ArrayList<>();
        int n = strs.length;
        
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i=0; i<n; i++) {
            
            List<String> list = new ArrayList<>();

            // Sort the string and use them as keys
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars); // sorted keys

            if(hm.get(key) != null) {
                list = hm.get(key);
                list.add(strs[i]);
                hm.put(key, list);
            } else {
            	list.add(strs[i]);
                hm.put(key, list);
            }
        }
        
        for(String k: hm.keySet()) {
        	finalList.add(hm.get(k));
        }
        
        return finalList;
        
    }
	public static void main(String[] args) {
		Anagrams a = new Anagrams();
		String[] s = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> ll = a.groupAnagrams(s);
        for(List<String> l : ll) {
            System.out.println(l);
        }
		
	}

}
