package Strings;
import java.util.*;

public class ValidIPAddresses {
    static void solve(String s, int i, int j, int level, String temp, ArrayList<String>res)
    {
        if (i == (j + 1) && level == 5) {
            res.add(temp.substring(1));
        }
    
        // Digits of a number ranging 0-255 can lie only between
        // 0-3
        for (int k = i; k < i + 3 && k <= j; k++) {
            String ad = s.substring(i, k + 1);
    
            // Return if string starting with '0' or it is
            // greater than 255.
            if ((s.charAt(i) == '0'&& ad.length()>1 ) || Integer.valueOf(ad) > 255)
                return;
    
            // Recursively call for another level.
            solve(s, k + 1, j, level + 1, temp + '.' + ad, res);
        }
    }
 
 
/* Driver program to test above function*/
    public static void main(String args[])
    {
        String s = "25525511135";
        int n = s.length();
    
        ArrayList<String> ans = new ArrayList<>();
    
        solve(s, 0, n - 1, 1, "", ans);
    
        for (String s1 : ans)
            System.out.println(s1);
    }
}
