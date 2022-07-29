package stringpractice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringReduce {
	
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
	
    public static void main(String[] args) {

        String s = "aaabccddd"; //bufferedReader.readLine();

        String result = StringReduce.superReducedString(s);
        System.out.println(result);

    }
}
