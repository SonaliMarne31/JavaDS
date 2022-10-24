package Strings;
import java.util.*;

public class LongestRepeatingCharReplacement {
    // Input: s = "ABAB", k = 2
    // Output: 4
    // Explanation: Replace the two 'A's with two 'B's or vice versa.

    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int mostFreqLetter = 0;
        int j = 0;
        int max = 0;
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'A']++; // this mean increament the index value by 1
            // a[0]++ will increment a[0] by 1
            mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(i) - 'A']);
            
            int lettersToChange = (i - j + 1) - mostFreqLetter;
            if(lettersToChange > k){
                freq[s.charAt(j) - 'A']--;
                j++;
            }
            
            max = Math.max(max, i - j + 1);
        }
        
        return max;
    }

    // Hashmap
    public int characterReplacement1(String s, int k) {
        int i = 0;
        int j = 0;
        
        Map<Character,Integer> map = new HashMap<>();
        
        int max = 0;
        
        int ans = 0;
        
        while( j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
            max = Math.max(max, map.get(s.charAt(j)));
            
            if(j-i+1-max <= k) {
                ans = Math.max(ans, j-i+1);
                j++;
            }else {
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "AABABBACF";
        int k = 1;
        int b = LongestRepeatingCharReplacement.characterReplacement(s, k);
        System.out.println(b);

        int a[] = new int[2];
        a[1]++;
        for(int i=0 ; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }



}
