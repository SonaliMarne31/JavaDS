package Strings;

import java.util.*;

public class KeyWordRow {
	Set<Character> r1 = new HashSet<>();
    Set<Character> r2 = new HashSet<>();
    Set<Character> r3 = new HashSet<>();
    
    public KeyWordRow() {
        
        r1.add('q');
        r1.add('w');
        r1.add('e');
        r1.add('r');
        r1.add('t');
        r1.add('y');
        r1.add('u');
        r1.add('i');
        r1.add('o');
        r1.add('p');
        			
        r2.add('a');
        r2.add('s');
        r2.add('d');
        r2.add('f');
        r2.add('g');
        r2.add('h');
        r2.add('j');
        r2.add('k');
        r2.add('l');
        
        r3.add('z');
        r3.add('x');
        r3.add('c');
        r3.add('v');
        r3.add('b');
        r3.add('n');
        r3.add('m');
        
    }
    
    public String[] findWords(String[] words) {
        String[] s = new String[words.length];
        int k = 0;
        for(int i = 0; i < words.length; i++) {
            boolean notOnOneLine = true;
            String w = words[i].toLowerCase();
            char w1 = w.charAt(0);
            Set<Character> lineMap = new HashSet<>();
            if (r1.contains(w1)) {
                lineMap = r1;
            }  else if (r2.contains(w1)) {
                lineMap = r2;
            } else if(r3.contains(w1)) {
                lineMap = r3;
            } else {
                lineMap = null;
            }
            if(lineMap != null) {
                for (int j = 1; j < w.length() ; j++) {
                    if (lineMap.contains(w.charAt(j))) {
                        notOnOneLine = false;
                        break;
                    }
                }

                if(notOnOneLine) {
                    s[k] = w;
                    k++;
                }
            }
            
        }
        return s;
    }
    
    public static void main(String args[]) {
    	KeyWordRow k = new KeyWordRow();
    	String[] s = {"Hello","Alaska","Dad","Peace"};
    	String[] kk = k.findWords(s);
//    	System.out.println("kk" + kk.);
    }
}
