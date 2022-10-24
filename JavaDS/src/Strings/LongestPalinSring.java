package Strings;

public class LongestPalinSring {
    Integer maxLength = 0;
    public static String longestPalindrome(String s) {
        int[] indexes = new int[3];
        for(int i=0;i<s.length();i++){
            //check odd length
            indexes = findPalindrome(i,i,s,indexes);
            //check even length 
            indexes = findPalindrome(i,i+1,s,indexes);
        }
        
        return s.substring(indexes[0],indexes[1]+1);
    }
    
    private static int[] findPalindrome(int left,int right,String s,int[] indexes){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            if(right-left+1> indexes[2]){
                indexes[2] = right-left+1;
                indexes[0] = left;
                indexes[1] = right;
            }
            left--;
            right++;
            
            
        }
        return indexes;
    }

    public static void main(String[] args) {
        String s = "babad";
        String str = LongestPalinSring.longestPalindrome(s);
        System.out.println(str);
    }
}
