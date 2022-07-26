package Strings;

/* Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.

Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String

Example.
aab shortens to b in one operation: remove the adjacent a characters.
Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'. */

public class SuperReducedString {
    public static String superReducedString(String s) {
        // Write your code here
          StringBuilder str = new StringBuilder(s);
            boolean passNeeded = true;
     
            while (passNeeded) {
                passNeeded = false;
                for (int i = 0; i < str.length() - 1; ++i) {
     
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        str.delete(i, i + 2);
                        passNeeded = true;
     
                    }
                }
            }
     
            if (str.length() == 0) {
                return "Empty String";
            } else {
                return str.toString();
            }
        }

        public static void main(String args[]) {
            String s = SuperReducedString.superReducedString("aab");
            System.out.println(s);
        }
    
}
