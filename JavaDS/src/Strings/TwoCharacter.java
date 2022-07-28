package Strings;

/* 
Given a string, remove characters until the string is made up of any two alternating characters. 
When you choose a character to remove, all instances of that character must be removed. Determine the longest string 
possible that contains just two alternating letters.

Sample Input

STDIN       Function
-----       --------
10          length of s = 10
beabeefeab  s = 'beabeefeab'
Sample Output

5 */

public class TwoCharacter {
    public static boolean isGood(String s){
        if (s.length()==1) return false;
        for(int i=1;i<s.length();i++){
            if (s.charAt(i)==s.charAt(i-1)) return false;
        }
        return true;
    }
    public static int alternate(String s) {
    // Write your code here
        String res="";
        int n = s.length();
        for(int i=0;i<26;i++){
            for(int j=i+1;j<26;j++){
                char a=(char)('a'+i);
                char b=(char)('a'+j);
                String cur="";
                for(int k=0;k<n;k++){
                    if (s.charAt(k)==a || s.charAt(k)==b) {
                        cur+=s.charAt(k);
                    }
                }
                if (cur.length()<res.length()) continue;
                if (isGood(cur)) res=cur;
            }
        }
        return res.length();
    }
}
