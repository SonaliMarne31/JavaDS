package Strings;

/* Given , determine the number of words in .

Example

There are  words in the string: 'one', 'Two', 'Three'. */

public class StrongPassword {
    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
        // Write your code here
            int count  = 0;
            if(s.length() == 0) return count;
            if(s.length() == 1) return 1;
            
            for(int i=0; i<s.length()-1 ; i++) {
                if(Character.isUpperCase(s.charAt(i))) {
                    count++;
                }
            }
            
            return count+1;
    }

    public static void main(String args[]) {
        int count = StrongPassword.camelcase("oneTwoThree");
        System.out.println(count);
    }
}
