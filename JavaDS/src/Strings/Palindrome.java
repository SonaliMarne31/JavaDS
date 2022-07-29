package Strings;

public class Palindrome {
	
	private boolean isPalin(String s) {
		
		String trim = s.trim(); // remove spaces
		String trimmedS = trim.toLowerCase();
		
		trimmedS = trimmedS.replaceAll("[^a-zA-Z]+", "");
		
		int len = trimmedS.length();
		int i = 0;
		int j = len-1;
		if(len <= 0) return false;
		
		while(j>i) {
			char c = trimmedS.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) { // is alphabet
				if (trimmedS.charAt(i) == trimmedS.charAt(j)) {
					i++;
					j--;
				} else {
					return false;
				}
			} else {
				i++;
				j--;
				continue;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		Palindrome p = new Palindrome();
		String s = "A man, a plan, a canal: Panama";
		System.out.print(p.isPalin(s));
		
	}
}
