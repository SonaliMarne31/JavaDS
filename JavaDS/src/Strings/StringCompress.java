package Strings;

public class StringCompress {

	public static void main(String[] args) {
		
		
		String s = new String("ffillltttteeeeedd");
		
		String str = "";
		
		int len = s.length();
		int j = 0;
		
		
		for(int i=0; i<len ;i++) {
			j=i+1;
			int count = 1;
			while(j<len && s.charAt(i) == s.charAt(j)) {
				j++;
				count++;
			}
			
			str+= s.charAt(i);
			str+= String.valueOf(count);
			
			i = j-1;
			
		}
		
		System.out.println(str);
		
	}

}
