package Strings;
import java.util.*;

public class CommonString {

    static int MAX_CHAR = 26;


    // Time Complexity : O(n) 
    static boolean twoStrings(String s1, String s2)
    {
        // vector for storing character occurrences
        boolean v[]=new boolean[MAX_CHAR];
        Arrays.fill(v,false);
     
        // increment vector index for every
        // character of str1
        for (int i = 0; i < s1.length(); i++)
            v[s1.charAt(i) - 'a'] = true;
         
        // checking common substring of str2 in str1
        for (int i = 0; i < s2.length(); i++)
            if (v[s2.charAt(i) - 'a'])
            return true;
         
        return false;    
    }

    // Approach 2
    static boolean hasSubstring(String s1, String s2) {

        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for(int i=0; i<s2.length(); i++) {
            if(set.contains(s2.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        // for(int i=0; i<str.length(); i++) {
        //     System.out.println(str.charAt(i) - 'a');
        // }

        String s1 = "sss";
        String s2 = "world";

        System.out.println(CommonString.hasSubstring(s1, s2));
        

    }
}
