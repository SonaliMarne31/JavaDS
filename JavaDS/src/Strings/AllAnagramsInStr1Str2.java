package Strings;
import java.util.*;

public class AllAnagramsInStr1Str2 {
    
    // Time complexity: O(Ns) s=length of largest string
    private static ArrayList<Integer> getAllAnagrams(String s1, String s2) {
        
        ArrayList<Integer> indexes = new ArrayList<Integer>();

        int windowSize = s2.length();
        char[] c = s2.toCharArray();
        Arrays.sort(c);
        String str2 = String.valueOf(c);

        int i=0;

        while(i <= (s1.length()-windowSize)) {
            char[] ch = s1.substring(i, i+windowSize).toCharArray();
            Arrays.sort(ch);
            if(String.valueOf(ch).equals(str2)) {
                indexes.add(i);
            }
            i++;
        }

        return indexes;
    }

    public static void main(String[] args) {
        String s1 = "abab";
        String s2 = "ab";

        ArrayList<Integer> list = AllAnagramsInStr1Str2.getAllAnagrams(s1, s2);
        System.out.println(list);

    }
}
